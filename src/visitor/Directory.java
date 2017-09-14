package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

    private String name;
    private List<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public Entry add(Entry entry) throws Exception {
        this.dir.add(entry);
        return this;
    }

    @Override
    public Iterator iterator() throws Exception {
        return this.dir.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return dir.stream().mapToInt(Entry::getSize).sum();
    }
}

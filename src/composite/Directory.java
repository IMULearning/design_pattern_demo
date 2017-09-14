package composite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

    private String name;
    private List<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return dir.stream().mapToInt(Entry::getSize).sum();
    }

    @Override
    public Entry add(Entry entry) throws Exception {
        this.dir.add(entry);
        return this;
    }

    @Override
    public void printList() {
        this.printList("");
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + java.io.File.separator + name);
        this.dir.forEach(entry -> entry.printList(prefix + java.io.File.separator + name));
    }
}

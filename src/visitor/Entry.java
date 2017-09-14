package visitor;

import java.util.Iterator;

public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws Exception {
        throw new Exception("not supported");
    }

    public Iterator iterator() throws Exception {
        throw new Exception("not supported");
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}

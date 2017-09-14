package composite;

public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    protected abstract void printList(String prefix);

    public Entry add(Entry entry) throws Exception {
        throw new Exception("not supported");
    }

    public void printList() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}

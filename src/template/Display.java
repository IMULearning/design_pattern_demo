package template;

public abstract class Display {

    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    public final void display() {
        this.open();
        this.print();
        this.close();
    }
}

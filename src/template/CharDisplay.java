package template;

public class CharDisplay extends Display {

    private final char c;

    public CharDisplay(char c) {
        this.c = c;
    }

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(this.c);
    }

    @Override
    protected void close() {
        System.out.println(">>");
    }
}

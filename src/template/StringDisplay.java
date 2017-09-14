package template;

public class StringDisplay extends Display {

    private final String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    protected void open() {
        this.printLine();
    }

    @Override
    protected void print() {
        System.out.println("|" + this.str + "|" );
    }

    @Override
    protected void close() {
        this.printLine();
    }

    private void printLine() {
        int length = this.str.getBytes().length;
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}

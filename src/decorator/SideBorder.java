package decorator;

public class SideBorder extends Border {

    private char borderCh;

    public SideBorder(Display display, char borderCh) {
        super(display);
        this.borderCh = borderCh;
    }

    // enhancement
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    // enhancement
    @Override
    public String getRowText(int row) {
        return borderCh + display.getRowText(row) + borderCh;
    }
}

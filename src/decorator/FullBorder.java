package decorator;

import java.util.stream.IntStream;

public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    // enhancement
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    // enhancement
    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', getColumns()) + "+";
        } else if (row == getRows() - 1) {
            return "+" + makeLine('-', getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    String makeLine(char ch, int count) {
        StringBuffer sb = new StringBuffer();
        IntStream.range(0, count).forEach(value -> sb.append(ch));
        return sb.toString();
    }
}

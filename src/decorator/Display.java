package decorator;

import java.util.stream.IntStream;

public abstract class Display {

    public abstract int getColumns();

    public abstract int getRows();

    public abstract String getRowText(int row);

    public final void show() {
        IntStream.range(0, getRows()).forEach(value ->
                System.out.println(getRowText(value)));
    }
}

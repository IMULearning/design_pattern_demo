package bridge;

import java.util.stream.IntStream;

public class EnhancedDisplay extends Display {

    public EnhancedDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        IntStream.range(0, times).forEach(value -> super.print());
        close();
    }
}

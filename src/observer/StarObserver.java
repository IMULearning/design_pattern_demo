package observer;

import java.util.stream.IntStream;

public class StarObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        StringBuffer sb = new StringBuffer();
        IntStream.range(0, generator.getNumber()).forEach(value -> sb.append("*"));
        System.out.println(sb.toString());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}

package observer;

public class PrintObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("[PrintObserver] number is " + generator.getNumber());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}

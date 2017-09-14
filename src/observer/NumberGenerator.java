package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        this.observers.parallelStream().forEach(observer -> observer.update(this));
    }

    public abstract int getNumber();

    public abstract void execute();
}

package mediator;

public class Event {

    public static final Event A = new Event(100);

    public static final Event B = new Event(1000);

    private int value;

    public Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

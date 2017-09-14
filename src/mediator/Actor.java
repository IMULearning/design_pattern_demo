package mediator;

public class Actor {

    private final int value;
    private final Mediator mediator;

    public Actor(Mediator mediator, int value) {
        this.mediator = mediator;
        this.value = value;
    }

    public void reportEvent() {
        this.mediator.eventHappend(this, new Event(this.value));
    }

    public void acceptMessage(String message) {
        System.out.println(message);
    }
}

package mediator;

public class Mediator {

    private final int max;
    private int value;

    public Mediator(final int max) {
        this.max = max;
        this.value = 0;
    }

    public void eventHappend(Actor actor, Event event) {
        if (value < max) {
            value += event.getValue();
            actor.acceptMessage("Event accepted. value=" + event.getValue());
        } else {
            actor.acceptMessage("Event refused");
        }
    }
}

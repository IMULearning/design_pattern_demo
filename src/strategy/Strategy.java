package strategy;

// Strategy is the entirety of how you do things
public interface Strategy {

    Hand nextHand();

    void study(boolean win);
}

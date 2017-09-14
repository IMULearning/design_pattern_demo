package strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {

    private Random random;

    public RandomStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(this.random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
        // no op
    }
}

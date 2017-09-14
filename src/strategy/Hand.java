package strategy;

public enum Hand {

    GUU(0),
    CHO(1),
    PAA(2);

    private final int value;

    Hand(int value) {
        this.value = value;
    }

    public boolean isStrongerThan(Hand h) {
        return this.fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return this.fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this.value == h.value) {
            return 0;
        } else if ((this.value + 1) % 3 == h.value) {
            return 1;
        } else {
            return -1;
        }
    }

    public static Hand getHand(int index) {
        switch (index) {
            case 0:
                return GUU;
            case 1:
                return CHO;
            case 2:
                return PAA;
            default:
                return PAA;
        }
    }
}

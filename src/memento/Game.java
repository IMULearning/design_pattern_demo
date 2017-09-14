package memento;

import java.util.Random;

public class Game {

    private int progress = 0;
    private Random random = new Random();

    public void proceed() {
        this.progress += this.random.nextInt(10);
        System.out.println("Progress is " + this.progress);
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this.progress);
    }

    public void restoreSnapshot(Snapshot snapshot) {
        this.progress = snapshot.getProgress();
        System.out.println("Progress restored to " + this.progress);
    }
}

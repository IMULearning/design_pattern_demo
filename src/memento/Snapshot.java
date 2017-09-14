package memento;

public class Snapshot {

    private final int progress;

    public Snapshot(int progress) {
        this.progress = progress;
    }

    public int getProgress() {
        return progress;
    }
}

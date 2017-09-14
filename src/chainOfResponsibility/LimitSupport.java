package chainOfResponsibility;

public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(int limit) {
        super("LimitSupport");
        this.limit = limit;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < this.limit) {
            return true;
        }
        return false;
    }
}

package chainOfResponsibility;

public class OddSupport extends Support {

    public OddSupport() {
        super("OddSupport");
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        }
        return false;
    }
}

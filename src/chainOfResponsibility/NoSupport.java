package chainOfResponsibility;

public class NoSupport extends Support {

    public NoSupport() {
        super("NoSupport");
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false;
    }
}

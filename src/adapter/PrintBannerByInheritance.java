package adapter;

public class PrintBannerByInheritance extends Banner implements Printer {

    public PrintBannerByInheritance(String name) {
        super(name);
    }

    @Override
    public void printWeak() {
        System.out.println("(" + super.getName() + ")");
    }

    @Override
    public void printStrong() {
        System.out.println("*" + super.getName() + "*");
    }
}

package adapter;

public class PrintBannerByComposition implements Printer {

    private final Banner banner;

    public PrintBannerByComposition(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeak() {
        System.out.println("(" + this.banner.getName() + ")");
    }

    @Override
    public void printStrong() {
        System.out.println("*" + this.banner.getName() + "*");
    }
}

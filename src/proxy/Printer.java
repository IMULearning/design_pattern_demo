package proxy;

public class Printer implements Printable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(String text) {
        System.out.println("printing...");
        try {
            Thread.sleep(2000);
            System.out.println(text);
            System.out.println("printed");
        } catch (InterruptedException ex) {
            System.out.println("print failed");
            return;
        }
    }
}

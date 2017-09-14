package proxy;

public class PrinterProxy implements Printable {

    private Printer printer;
    private String name;

    @Override
    public String getName() {
        if (this.printer != null)
            return this.printer.getName();
        return this.name;
    }

    @Override
    public synchronized void setName(String name) {
        if (this.printer != null) {
            this.printer.setName(name);
        }
        this.name = name;
    }

    @Override
    public void print(String text) {
        if (this.printer == null) {
            this.printer = new Printer();
        }
        this.printer.print(text);
    }
}

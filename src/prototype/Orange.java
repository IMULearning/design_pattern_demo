package prototype;

public class Orange implements Product {

    @Override
    public void use(String s) {
        System.out.println("This is an orange (s=" + s + ")");
    }

    @Override
    public Product createClone() {
        Product cloned = null;
        try {
            cloned = (Product) this.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return cloned;
    }
}

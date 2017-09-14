package prototype;

import java.util.HashMap;

public class Manager {

    private HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product p) {
        this.showcase.put(name, p);
    }

    public Product create(String name) {
        Product p = this.showcase.get(name);
        return p.createClone();
    }
}

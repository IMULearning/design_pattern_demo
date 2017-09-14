package factory;

public class IDCard extends Product {

    private final String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this.owner + " used ID Card.");
    }

    public String getOwner() {
        return owner;
    }
}

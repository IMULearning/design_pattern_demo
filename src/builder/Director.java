package builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        this.builder.makeTitle("Greeting");
        this.builder.makeString("Morning to Afternoon");
        this.builder.makeItems(new String[]{
                "Good morning!",
                "Good afternoon!"
        });
        this.builder.makeString("Evening");
        this.builder.makeItems(new String[]{
                "Good evening!",
                "Good night!",
                "Goodbye"
        });
        this.builder.close();
    }
}

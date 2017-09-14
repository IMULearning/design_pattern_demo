package singleton;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Singleton was created.");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void helloWorld() {
        System.out.println("Hello World");
    }
}

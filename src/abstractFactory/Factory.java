package abstractFactory;

public abstract class Factory {

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);

    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return factory;
    }
}

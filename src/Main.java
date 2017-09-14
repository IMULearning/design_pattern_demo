import abstractFactory.Link;
import abstractFactory.Page;
import abstractFactory.Tray;
import adapter.Banner;
import adapter.PrintBannerByComposition;
import adapter.PrintBannerByInheritance;
import adapter.Printer;
import bridge.StringDisplayImpl;
import builder.Director;
import builder.HTMLBuilder;
import builder.TextBuilder;
import chainOfResponsibility.*;
import composite.Directory;
import composite.File;
import decorator.FullBorder;
import decorator.SideBorder;
import facade.DataWriter;
import factory.Factory;
import factory.IDCardFactory;
import factory.Product;
import iterator.Book;
import iterator.BookShelf;
import iterator.Iterator;
import mediator.Actor;
import mediator.Mediator;
import memento.Game;
import memento.Snapshot;
import observer.*;
import prototype.Apple;
import prototype.Manager;
import proxy.Printable;
import proxy.PrinterProxy;
import singleton.Singleton;
import strategy.Hand;
import strategy.Player;
import strategy.RandomStrategy;
import strategy.WinningStrategy;
import template.CharDisplay;
import template.Display;
import template.StringDisplay;
import visitor.ListVisitor;

public class Main {

    public static void main(String[] args) {
        //iteratorDemo();
        //adapterDemo();
        //templateDemo();
        //factoryDemo();
        //singletonDemo();
        //prototypeDemo();
        //builderDemo(args);
        //abstractFactoryDemo();
        //bridgeDemo();
        //strategyDemo();
        //compositeDemo();
        //decoratorDemo();
        //visitorDemo();
        //chainOfResponsibilityDemo();
        //facadeDemo();
        //mediatorDemo();
        //observerDemo();
        //mementoDemo();
        //proxyDemo();
    }

    static void proxyDemo() {
        Printable printer = new PrinterProxy();
        printer.setName("MyPrinter");
        System.out.println("Set name to " + printer.getName());
        printer.print("Hello World!");
    }

    static void mementoDemo() {
        Game game = new Game();
        game.proceed();
        game.proceed();
        Snapshot snapshot = game.createSnapshot();
        System.out.println("Taken snapshot");
        game.proceed();
        game.proceed();
        game.restoreSnapshot(snapshot);
        game.proceed();
    }

    static void observerDemo() {
        Observer printObserver = new PrintObserver();
        Observer starObserver = new StarObserver();

        NumberGenerator generator = new RandomNumberGenerator();
        generator.addObserver(printObserver);
        generator.addObserver(starObserver);

        generator.execute();
    }

    static void mediatorDemo() {
        Mediator mediator = new Mediator(100);
        Actor actorOne = new Actor(mediator, 80);
        Actor actorTwo = new Actor(mediator, 200);
        actorOne.reportEvent();
        actorTwo.reportEvent();
        actorOne.reportEvent();
    }

    static void facadeDemo() {
        DataWriter.API();
    }

    static void chainOfResponsibilityDemo() {
        Support support = new NoSupport().setNext(
                new LimitSupport(100).setNext(
                        new OddSupport()
                )
        );
        support.support(new Trouble(1025));
        support.support(new Trouble(5));
    }

    static void visitorDemo() {
        visitor.Directory root = new visitor.Directory("root");
        try {
            root.add(
                    new visitor.Directory("bin")
                            .add(
                                    new visitor.File("javac", 1000)
                            ).add(new visitor.File("foo.bar", 5)));
            root.accept(new ListVisitor());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static void decoratorDemo() {
        decorator.Display d1 = new decorator.StringDisplay("Hello, world");
        decorator.Display d2 = new SideBorder(d1, '#');
        decorator.Display d3 = new FullBorder(d2);

        d1.show();
        d2.show();
        d3.show();
    }

    static void compositeDemo() {
        Directory root = new Directory("root");
        try {
            root.add(new Directory("bin")
                            .add(new File("javac", 1000)))
                    .add(new File("foo.bar", 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
        root.printList();
    }

    static void strategyDemo() {
        Player david = new Player("David", new WinningStrategy(3));
        Player ark = new Player("Ark", new RandomStrategy(5));

        for (int i = 0; i < 1000; i++) {
            Hand davidHand = david.nextHand();
            Hand arkHand = ark.nextHand();
            if (davidHand.isStrongerThan(arkHand)) {
                david.win();
                ark.lose();
            } else if (davidHand.isWeakerThan(arkHand)) {
                david.lose();
                ark.win();
            } else {
                david.even();
                ark.even();
            }
        }

        System.out.println(david);
        System.out.println(ark);
    }

    static void bridgeDemo() {
        bridge.Display d1 = new bridge.Display(new StringDisplayImpl("Hello"));
        bridge.EnhancedDisplay d2 = new bridge.EnhancedDisplay(new StringDisplayImpl("World"));
        d1.display();
        d2.display();
        d2.multiDisplay(3);
    }

    static void abstractFactoryDemo() {
        abstractFactory.Factory factory = abstractFactory.Factory.getFactory("abstractFactory.list.ListFactory");

        Link foo = factory.createLink("foo", "http://foo.com");
        Link bar = factory.createLink("bar", "http://bar.com");

        Tray foobar = factory.createTray("foobar");
        foobar.add(foo);
        foobar.add(bar);

        Page page = factory.createPage("TestPage", "David");
        page.add(foobar);
        page.output();
    }

    static void builderDemo(String[] args) {
        String mode = "plain";
        if (args.length >= 1) {
            mode = args[0];
        }

        switch (mode) {
            case "plain":
                TextBuilder textBuilder = new TextBuilder();
                Director director = new Director(textBuilder);
                director.construct();
                System.out.println(textBuilder.getResult());
                break;
            case "html":
                HTMLBuilder htmlBuilder = new HTMLBuilder();
                Director anotherDirector = new Director(htmlBuilder);
                anotherDirector.construct();
                System.out.println(htmlBuilder.getResult());
                break;
        }
    }

    static void prototypeDemo() {
        Manager manager = new Manager();
        manager.register("apple", new Apple());
        manager.register("orange", new Apple());

        prototype.Product apple1 = manager.create("apple");
        prototype.Product apple2 = manager.create("apple");

        System.out.println(apple1);
        System.out.println(apple2);
    }

    static void singletonDemo() {
        Singleton.getInstance().helloWorld();
        Singleton.getInstance().helloWorld();
    }

    static void factoryDemo() {
        Factory factory = new IDCardFactory();
        Product davidProduct = factory.create("David");
        davidProduct.use();
        Product arkProduct = factory.create("Ark");
        arkProduct.use();
    }

    static void templateDemo() {
        Display charDisplay = new CharDisplay('$');
        charDisplay.display();

        Display stringDisplay = new StringDisplay("Hello World");
        stringDisplay.display();
    }

    static void adapterDemo() {
        Printer byInheritance = new PrintBannerByInheritance("Adapter By Inheritance Demo");
        byInheritance.printWeak();
        byInheritance.printStrong();

        Printer byComposition = new PrintBannerByComposition(new Banner("Adapter By Composition Demo"));
        byComposition.printWeak();
        byComposition.printStrong();
    }

    static void iteratorDemo() {
        BookShelf shelf = new BookShelf();
        shelf.appendBook(new Book("Designing the Man"));
        shelf.appendBook(new Book("Kingdom and Power"));
        shelf.appendBook(new Book("Java Distributed"));
        shelf.appendBook(new Book("Spring Security Pro"));
        Iterator it = shelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}

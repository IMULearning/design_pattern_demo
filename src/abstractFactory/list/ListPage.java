package abstractFactory.list;

import abstractFactory.Item;
import abstractFactory.Page;

import java.util.Iterator;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();

        sb.append(String.format("<html><head><title>%s</title></head><body><h1>%s</h1>", super.title, super.title));
        sb.append("<ul>\n");
        Iterator it = super.content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            sb.append(item.makeHTML());
        }
        sb.append(String.format("</ul><hr><address>%s</address></body></html>", super.author));
        return sb.toString();
    }
}

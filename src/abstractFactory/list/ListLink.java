package abstractFactory.list;

import abstractFactory.Link;

public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return String.format("\t<li><a href=\"%s\">%s</a></li>\n", super.url, super.caption);
    }
}

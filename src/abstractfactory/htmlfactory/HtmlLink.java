package abstractfactory.htmlfactory;

import abstractfactory.factory.Link;

public class HtmlLink extends Link {
    public HtmlLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String format() {
        return String.format("<a href=\"%s\">%s</a>", this.url, this.caption);
    }
}

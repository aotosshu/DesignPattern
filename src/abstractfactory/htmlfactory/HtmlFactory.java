package abstractfactory.htmlfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

public class HtmlFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new HtmlLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new HtmlTray(caption);
    }

    @Override
    public Page createPage(String title) {
        return new HtmlPage(title);
    }
}

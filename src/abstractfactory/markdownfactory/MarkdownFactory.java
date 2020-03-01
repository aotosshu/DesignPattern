package abstractfactory.markdownfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

public class MarkdownFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new MarkdownLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new MarkdownTray(caption);
    }

    @Override
    public Page createPage(String title) {
        return new MarkdownPage(title, "md");
    }
}

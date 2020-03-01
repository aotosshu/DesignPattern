package abstractfactory.markdownfactory;

import abstractfactory.factory.Link;

public class MarkdownLink extends Link {
    public MarkdownLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String format() {
        return String.format("[%s](%s)", this.caption, this.url) + System.lineSeparator();
    }
}

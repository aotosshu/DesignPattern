package abstractfactory.markdownfactory;

import abstractfactory.factory.Item;
import abstractfactory.factory.Page;

public class MarkdownPage extends Page {
    public MarkdownPage(String filename, String fileExtension) {
        super(filename, fileExtension);
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("# %s", this.title)).append(System.lineSeparator());
        sb.append(System.lineSeparator());
        for (Item item : this.items) {
            sb.append(item.format());
        }
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}

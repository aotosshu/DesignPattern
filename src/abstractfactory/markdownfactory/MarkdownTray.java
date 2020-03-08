package abstractfactory.markdownfactory;

import abstractfactory.factory.Item;
import abstractfactory.factory.Tray;

public class MarkdownTray extends Tray {
    public MarkdownTray(String caption) {
        super(caption);
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("## %s", this.caption)).append(System.lineSeparator());
        sb.append(System.lineSeparator());
        for (Item item : this.items) {
            sb.append("- ").append(item.format()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}

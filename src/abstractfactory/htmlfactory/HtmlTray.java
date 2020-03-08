package abstractfactory.htmlfactory;

import abstractfactory.factory.Item;
import abstractfactory.factory.Tray;

public class HtmlTray extends Tray {
    public HtmlTray(String caption) {
        super(caption);
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("<div>%s</div>", this.caption)).append(System.lineSeparator());
        sb.append("<ul>").append(System.lineSeparator());
        for (Item item : this.items) {
            sb.append(String.format("<li>%s</li>", item.format())).append(System.lineSeparator());
        }
        sb.append("</ul>").append(System.lineSeparator());
        return sb.toString();
    }
}

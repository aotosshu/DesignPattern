package abstractfactory.htmlfactory;

import abstractfactory.factory.Item;
import abstractfactory.factory.Page;

public class HtmlPage extends Page {
    public HtmlPage(String title) {
        super(title);
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>").append(System.lineSeparator());
        sb.append("<head>").append(System.lineSeparator());
        sb.append(String.format("<title>%s</title>", this.title)).append(System.lineSeparator());
        sb.append("</head>").append(System.lineSeparator());
        sb.append("<body>").append(System.lineSeparator());
        sb.append(String.format("<h1>%s</h1>", this.title)).append(System.lineSeparator());
        for (Item item : this.items) {
            sb.append("<p>").append(System.lineSeparator());
            sb.append(item.format());
            sb.append("</p>").append(System.lineSeparator());
        }
        sb.append("</body>").append(System.lineSeparator());
        sb.append("</html>").append(System.lineSeparator());
        return sb.toString();
    }
}

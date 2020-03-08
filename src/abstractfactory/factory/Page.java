package abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
    protected String title;
    protected String fileExtension;
    protected ArrayList<Item> items = new ArrayList<>();

    protected Page(String title) {
        this.title = title;
    }

    public Page add(Item item) {
        items.add(item);
        return this;
    }

    public void output() {
        System.out.println("```");
        System.out.println(this.format());
        System.out.println("```");
    }

    public abstract String format();
}

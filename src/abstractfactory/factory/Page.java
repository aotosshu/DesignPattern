package abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
    protected String title;
    protected String fileExtension;
    protected ArrayList<Item> items = new ArrayList<>();

    protected Page(String title, String fileExtension) {
        this.title = title;
        this.fileExtension = fileExtension;
    }

    public Page add(Item item) {
        items.add(item);
        return this;
    }

    public void output() {
        String filename = this.title + "." + this.fileExtension;
        try(Writer writer = new FileWriter(filename)) {
            writer.write(this.format());
            System.out.println(filename + " を作成しました。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String format();
}

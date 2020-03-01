package abstractfactory.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList<Item> items = new ArrayList<>();

    protected Tray(String caption) {
        super(caption);
    }

    public Tray add(Item item) {
        items.add(item);
        return this;
    }
}

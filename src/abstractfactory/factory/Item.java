package abstractfactory.factory;

public abstract class Item {
    protected String caption;

    protected Item(String caption) {
        this.caption = caption;
    }

    public abstract String format();
}

package abstractfactory.factory;

public abstract class Link extends Item {
    protected String url;

    protected Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}

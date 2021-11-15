import static java.lang.Thread.sleep;

public abstract class Element {
    protected long sizeKB;
    protected String title;

    abstract int timpDescarcare();
    abstract long totalSize();

    protected Element(long sizeKB, String title) {
        this.sizeKB=sizeKB;
        this.title=title;                        }

    abstract void startElement();
}

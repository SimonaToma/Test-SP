import java.util.ArrayList;

public class Playlist extends Element {
    private ArrayList<Element> elements;

    protected Playlist(long sizeKB, String title) {
        super(sizeKB, title);
        this.elements=new ArrayList<>();        }

    @Override
    int timpDescarcare() {
        return 0;        }

    @Override
    long totalSize() {
        return this.sizeKB;}

    public void addElement(Element element) {
        this.elements.add(element);         }

    public void startElement() {
        System.out.println("Playlist "+this.title+" is downloading...");
        for (int i=0; i<this.elements.size(); i++) {
           this.elements.get(i).startElement();        }
        System.out.println("Playlist "+this.title+" is playing.");
        System.out.println("Playlist "+this.title+" finished."); }
}

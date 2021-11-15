import static java.lang.Thread.sleep;

public class Videoclip extends Element  {
    public Videoclip(long sizeKB, String title) {
        super(sizeKB, title);                   }

    @Override
    int timpDescarcare() {
        return 5;        }

    @Override
    long totalSize() {
        return this.sizeKB;}

    public void startElement() {
        System.out.println("Video "+this.title+" is downloading...");
        try {
            sleep(this.timpDescarcare()*1000);
            } 
            catch (InterruptedException e) {
            e.printStackTrace();           }

        System.out.println("Video "+this.title+" is playing.");
                               }

}

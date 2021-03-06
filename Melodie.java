import static java.lang.Thread.sleep;

public class Melodie extends Element  {
    public Melodie(long sizeKB, String title) {
        super(sizeKB, title);                 }

    @Override
    int timpDescarcare() {
        return 3;        }

    @Override
    long totalSize() {
        return this.sizeKB;
                     }

    public void startElement() {
        System.out.println("Music "+this.title+" is downloading...");
        try {
            sleep(this.timpDescarcare()*1000);
            } 
            catch (InterruptedException e) {
            e.printStackTrace();           }

        System.out.println("Music "+this.title+" is playing.");
                               }

}

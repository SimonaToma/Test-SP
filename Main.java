public class Main {

    public static void main(String[] args) {
        GIF gif1 = new GIF(128, "Cat 1");
        GIF gif2 = new GIF(128, "Cat 2");
        GIF gif3 = new GIF(128, "Cat 3");

        Videoclip video1 = new Videoclip(10230214, "Mariah Carey - All I Want for Christmas Is You");
        Videoclip video2 = new Videoclip(24654114, "Wham! - Last Christmas");

        Melodie melodie1 = new Melodie(44787, "Band Aid - Do they know it's christmas 1984");
        Melodie melodie2 = new Melodie(44787, "Shakin' Stevens - Merry christmas everyone");
        Melodie melodie3 = new Melodie(44787, "Michael Bublé - It's beginning to look a lot like christmas");

        Playlist playlist1 = new Playlist(100, "Chris Rea - Driving home for christmas");
        playlist1.addElement(video1);
        playlist1.addElement(melodie2);
        playlist1.addElement(melodie3);

        Playlist playlist2 = new Playlist(100, "More...");
        playlist2.addElement(video2);
        playlist2.addElement(melodie1);
        playlist2.addElement(gif1);
        playlist2.addElement(gif2);
        playlist2.addElement(gif3);

        playlist1.addElement(playlist2);




        playlist1.startElement();
    }

}

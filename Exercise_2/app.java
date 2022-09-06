import java.util.LinkedList;
public class App 
{
    public static void main(String[] args) throws Exception {
        // Creating a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("Poetic Justice");
        Playlist.add("my.life");
        Playlist.add("The London");
        Playlist.add("LOVE");
        Playlist.add("Take Care");

        // Adds a new song at the front of the Playlist
        Playlist.addFirst("a lot");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("DNA.");

        // Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(6, "Fashion Killa");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}

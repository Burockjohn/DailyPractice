package day43_DailyReviews.musicPlayer;

public class Player {
    public static void main(String[] args) throws InterruptedException {

        Playlist playlist = new Playlist();

        playlist.addSong("Aşkın olayım", "Simge", 4.04);
        playlist.addSong("Taşkın olayım", "İmge", 1.05);
        playlist.addSong("Şaşkın olayım", "Müge", 2.06);
        playlist.addSong("Başkın olayım", "Ludovico Einaudi", 3.07);
        playlist.addSong("Daşkın olayım", "Kahtalı Mıçı", 4.08);

        playlist.removeSong("Daşkın Olayım");

        playlist.playAll();

        System.out.println(playlist.getSongs());

    }

}

/*

Create a class named Player with a main method that demonstrates how to use the Song and Playlist classes to add,
remove, and play songs in a playlist.


 */
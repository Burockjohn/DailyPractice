package day43_DailyReviews.musicPlayer;

public class Song {

    private String title, artist;
    private double duration;


    public Song(String title, String artist, double duration) {
        setTitle(title);
        setArtist(artist);
        setDuration(duration);
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }


    //--------------------------------------------//


    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        for (char ch : artist.toCharArray()) {
            if (Character.isDigit(ch)) {
                System.err.println("Are you son of Elon Musk?");
                return;
            }
        }
        this.artist = artist;
    }

    public void setDuration(double duration) {
        if (duration <= 0) {
            System.err.println("Come oooonnnn, let's play a music");
            return;
        }
        this.duration = duration;
    }

    //-------------------------------------------//

    public void play() throws InterruptedException {
        System.out.println(title + " - " + artist + " is playing");
        Thread.sleep((long) duration * 1000);
    }

    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}


/*

Create a program that models a simple music player.

Create a class named Song with private instance variables for the song's title, artist, and duration.
Create a constructor that takes the title, artist, and duration as parameters and sets them as the instance variables.
Create methods for getting and setting the title, artist, and duration of the song.
Create a method named play that prints out a message indicating that the song is playing.
Create a class named Playlist with an ArrayList of Song objects as a private instance variable.
Create methods for adding a song to the playlist, removing a song from the playlist, and playing all the songs in the playlist in order.
Create a class named Player with a main method that demonstrates how to use the Song and Playlist classes to add, remove, and play songs in a playlist.

 */

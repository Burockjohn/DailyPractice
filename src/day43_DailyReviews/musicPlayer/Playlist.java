package day43_DailyReviews.musicPlayer;

import java.util.ArrayList;

public class Playlist {

    private ArrayList<Song> songs;


    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(String title, String artist, double duration) {
        songs.add(new Song(title, artist, duration));
    }

    public void removeSong(String title) {
        songs.removeIf(p-> p.getTitle().equalsIgnoreCase(title));
    }


    public void playAll() throws InterruptedException{
        for (Song song : songs) {
            song.play();
        }
    }
}

/*

Create a class named Playlist with an ArrayList of Song objects as a private instance variable.
Create methods for adding a song to the playlist, removing a song from the playlist, and playing all the songs in the playlist in order.
Create a class named Player with a main method that demonstrates how to use the Song and Playlist classes to add, remove, and play songs in a playlist.

 */
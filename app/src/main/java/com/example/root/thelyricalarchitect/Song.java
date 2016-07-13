package com.example.root.thelyricalarchitect;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/**
 * Created by root on 26/6/16.
 */
public class Song {
    private long id;
    private String title;
    private String artist;
    private String album;
    private Bitmap albumArt;

    public Song(){
        id = -1;
        title="";
        artist="";
        album="";
        albumArt=null;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public Bitmap getAlbumArt() {
        if(albumArt!=null){
            return albumArt;
        }else{
            return null;
        }
    }

    public void setSongId(long id) {
        if(id!=-1){
            this.id = id;
        }
    }

    public void setSongTitle(String title) {
        if(title!=null){
            this.title = title;
        }
    }

    public void setSongArtist(String artist) {
        if(artist!=null){
            this.artist = artist;
        }
    }

    public void setSongAlbum(String album) {
        if(album!=null){
            this.album = album;
        }
    }

    public void setSongAlbumArt(Bitmap albumArt) {
        if(albumArt!=null){
            this.albumArt = albumArt;
        }
    }
}
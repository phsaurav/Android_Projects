package com.delaroystudios.cardview.Model;

public class AlbumStudent {
    private String numofsong;
    private String tile;
    private String thumbleimage;

    public AlbumStudent(String numofsong, String tile, String thumbleimage) {
        this.numofsong = numofsong;
        this.tile = tile;
        this.thumbleimage = thumbleimage;
    }

    public String getNumofsong() {
        return numofsong;
    }

    public void setNumofsong(String numofsong) {
        this.numofsong = numofsong;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getThumbleimage() {
        return thumbleimage;
    }

    public void setThumbleimage(String thumbleimage) {
        this.thumbleimage = thumbleimage;
    }
}

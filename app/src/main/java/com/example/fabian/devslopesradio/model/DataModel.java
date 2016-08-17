package com.example.fabian.devslopesradio.model;

/**
 * Created by Fabian on 17.08.2016.
 */
public class DataModel {

    private String songTitle;
    private int songImgUri;

    public DataModel(String songTitle, int songImgUri) {
        this.songTitle = songTitle;
        this.songImgUri = songImgUri;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public int getSongImgUri() {
        return songImgUri;
    }

    public void setSongImgUri(int songImgUri) {
        this.songImgUri = songImgUri;
    }
}

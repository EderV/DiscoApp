package com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Musica;

public class Musica {

    private String mSongName;
    private String mSongArtist;
    private int mSongImage;

    public Musica(String songName, String songArtist, int songImage){
        this.mSongName = songName;
        this.mSongArtist = songArtist;
        this.mSongImage = songImage;
    }

    public void setSongName(String mSongName) {
        this.mSongName = mSongName;
    }

    public void setSongArtist(String mSongArtist) {
        this.mSongArtist = mSongArtist;
    }

    public void setSongImage(int mSongImage) {
        this.mSongImage = mSongImage;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getSongArtist() {
        return mSongArtist;
    }

    public int getSongImage() {
        return mSongImage;
    }
}

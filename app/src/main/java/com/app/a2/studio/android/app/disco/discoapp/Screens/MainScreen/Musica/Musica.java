package com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Musica;

public class Musica {

    private String mSongName;
    private String mSongArtist;
    private int mSongImage;
    private String mSongVotes;

    public Musica(String songName, String songArtist, int songImage, String songVotes){
        this.mSongName = songName;
        this.mSongArtist = songArtist;
        this.mSongImage = songImage;
        this.mSongVotes = songVotes;
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

    public void setSongVotes(String mSongVotes) {
        this.mSongVotes = mSongVotes;
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

    public String getSongVotes() {
        return mSongVotes;
    }
}

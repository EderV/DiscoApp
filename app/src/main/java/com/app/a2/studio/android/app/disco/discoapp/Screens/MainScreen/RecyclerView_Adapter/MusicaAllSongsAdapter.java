package com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.RecyclerView_Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.a2.studio.android.app.disco.discoapp.R;
import com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Musica.Musica;
import java.util.List;

public class MusicaAllSongsAdapter extends RecyclerView.Adapter<MusicaAllSongsAdapter.MusicaAllSongsViewHolder>{

    // Atributos
    private List<Musica> mData;

    public MusicaAllSongsAdapter(List<Musica> data){
        this.mData = data;
    }

    @NonNull
    @Override
    public MusicaAllSongsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dessign_all_songs_recyclerview, parent, false);
        return new MusicaAllSongsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicaAllSongsViewHolder holder, int position) {
        holder.songImage.setImageResource(mData.get(position).getSongImage());
        holder.songName.setText(mData.get(position).getSongName());
        holder.songArtist.setText(mData.get(position).getSongArtist());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MusicaAllSongsViewHolder extends RecyclerView.ViewHolder{
        public ImageView songImage;
        public TextView songName, songArtist;

        public MusicaAllSongsViewHolder(View v){
            super(v);
            songImage = v.findViewById(R.id.dasr_iv_SongImage);
            songName = v.findViewById(R.id.dasr_tv_SongName);
            songArtist = v.findViewById(R.id.dasr_tv_SongArtist);
        }
    }
}

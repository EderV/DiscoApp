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

public class MusicaVoteListAdapter extends RecyclerView.Adapter<MusicaVoteListAdapter.MusicaVoteListViewHolder> {

    // Atributos
    private List<Musica> mData;

    public MusicaVoteListAdapter(List<Musica> data){
        this.mData = data;
    }

    @NonNull
    @Override
    public MusicaVoteListAdapter.MusicaVoteListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_more_voted_songs_recyclerview, parent, false);
        return new MusicaVoteListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicaVoteListAdapter.MusicaVoteListViewHolder holder, int position) {
        holder.songImage.setImageResource(mData.get(position).getSongImage());
        holder.songName.setText(mData.get(position).getSongName());
        holder.songArtist.setText(mData.get(position).getSongArtist());
        holder.voteCount.setText(mData.get(position).getSongVotes());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MusicaVoteListViewHolder extends RecyclerView.ViewHolder{
        public ImageView songImage;
        public TextView songName, songArtist, voteCount;

        public MusicaVoteListViewHolder(View v){
            super(v);
            songImage = v.findViewById(R.id.dmvsr_iv_SongImage);
            songName = v.findViewById(R.id.dmvsr_tv_SongName);
            songArtist = v.findViewById(R.id.dmvsr_tv_SongArtist);
            voteCount = v.findViewById(R.id.dmvsr_tv_Votes);
        }
    }
}

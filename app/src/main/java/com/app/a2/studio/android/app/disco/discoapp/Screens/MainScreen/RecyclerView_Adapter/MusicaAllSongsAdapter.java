package com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.RecyclerView_Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Musica.Musica;
import java.util.List;

public class MusicaAllSongsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    // Atributos
    private List<Musica> mData;

    public MusicaAllSongsAdapter(List<Musica> data){
        this.mData = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

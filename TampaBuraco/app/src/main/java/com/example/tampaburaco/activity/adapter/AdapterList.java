package com.example.tampaburaco.activity.adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tampaburaco.R;
import com.example.tampaburaco.activity.model.Feed;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.MyViewHolder> {

    private List<Feed> feedList;

    public AdapterList(List<Feed> list) {
        this.feedList = list;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Feed feed = feedList.get(position);
       holder.imagePrincipal.setImageResource(feed.getImageView());
       holder.imageUsuario.setImageResource(feed.getImageUsuario());
        holder.usuario.setText(feed.getUsuario());
        holder.endereco.setText(feed.getEndereco());
        holder.data.setText(feed.getData());
        holder.comentario.setText(feed.getComentario());

    }

    @Override
    public int getItemCount() {
        return feedList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imagePrincipal;
        ImageView imageUsuario;
        TextView usuario;
        TextView  endereco;
        TextView data;
        TextView comentario;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imagePrincipal = itemView.findViewById(R.id.imageView);
            imageUsuario = itemView.findViewById(R.id.imageUsuario);
            usuario = itemView.findViewById(R.id.usuario);
            endereco =  itemView.findViewById(R.id.endereco);
            data = itemView.findViewById(R.id.data);
            comentario = itemView.findViewById(R.id.comentario);

        }
    }
}

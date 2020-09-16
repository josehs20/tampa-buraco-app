package com.example.tampaburaco.activity.model;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Feed {

    private int imageView;
    private int imageUsuario;
    private String usuario;
    private String endereco;
    private String data;
    private String comentario;

    public Feed(int imageView, int imageUsuario, String usuario, String endereco, String data, String comentario) {
        this.imageView = imageView;
        this.imageUsuario = imageUsuario;
        this.usuario = usuario;
        this.endereco = endereco;
        this.data = data;
        this.comentario = comentario;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public int getImageUsuario() {
        return imageUsuario;
    }

    public void setImageUsuario(int imageUsuario) {
        this.imageUsuario = imageUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
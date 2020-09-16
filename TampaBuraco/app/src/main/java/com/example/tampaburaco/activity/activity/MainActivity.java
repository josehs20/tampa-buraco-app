package com.example.tampaburaco.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tampaburaco.R;
import com.example.tampaburaco.activity.adapter.AdapterList;
import com.example.tampaburaco.activity.model.Feed;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerFeed;
    private List<Feed> listaFeed = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerFeed = findViewById(R.id.recyclerFeed);

        //criador feed

        this.criarFeeds();


        //conf adapter

        AdapterList adapterList = new AdapterList(listaFeed);



        //conf recycler

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerFeed.setLayoutManager(layoutManager);
        recyclerFeed.setHasFixedSize( true );
        recyclerFeed.setAdapter( adapterList );

    }

    public void criarFeeds(){

        Feed feed = new Feed(R.drawable.buraco1, R.drawable.aaaaa,"José Carlos","AV. Santos", "22/08/2020", "Cometários");
        this.listaFeed.add(feed);

        feed = new Feed(R.drawable.buraco2, R.drawable.aaaaa,"José Carlos","AV. Santos", "22/08/2020", "Cometários");
        this.listaFeed.add(feed);

        feed = new Feed(R.drawable.buraco3, R.drawable.aaaaa,"José Carlos","AV. Santos", "22/08/2020", "Cometários");
        this.listaFeed.add(feed);

        feed = new Feed(R.drawable.burco4, R.drawable.aaaaa,"José Carlos","AV. Santos", "22/08/2020", "Cometários");
        this.listaFeed.add(feed);

        feed = new Feed(R.drawable.bruaco5, R.drawable.aaaaa,"José Carlos","AV. Santos", "22/08/2020", "Cometários");
        this.listaFeed.add(feed);

        feed = new Feed(R.drawable.buraco6, R.drawable.aaaaa,"José Carlos","AV. Santos", "22/08/2020", "Cometários");
        this.listaFeed.add(feed);



    }

}
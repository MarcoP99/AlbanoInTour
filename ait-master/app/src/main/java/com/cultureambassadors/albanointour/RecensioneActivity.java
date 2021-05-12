package com.cultureambassadors.albanointour;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecensioneActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recensioni);
        Toolbar toolbar = findViewById(R.id.toolbar_rece);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onBackPressed();
            }
        });

        Bundle bundle = getIntent().getExtras();
        String name = "";
        
        if (bundle != null)
            name = bundle.getString("name");
        
        TextView rec_txt = findViewById(R.id.txt_Recensioni);
        TextView voto_m = findViewById(R.id.voto_medio);
        TextView nTotRec = findViewById(R.id.txt_N_tot_recensioni);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        
        RecyclerView recRecyclerView = findViewById(R.id.Rec_RecyclerView);
        recRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        
        RecensioniViewAdapter recensioniViewAdapter = new RecensioniViewAdapter(getApplicationContext(), name, ratingBar, voto_m);
        recRecyclerView.setAdapter(recensioniViewAdapter);
    }
}
package com.cultureambassadors.albanointour;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.ParseException;

public class BCListActivity extends AppCompatActivity
{
    
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bclist);
        RecyclerView bcRecyclerView = findViewById(R.id.bcRecyclerView);
        bcRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Bundle bundle = getIntent().getExtras();
        String filter = "Lista dei beni culturali";
        if (bundle != null)
            filter = bundle.getString("filter");
        BCViewAdapter bcViewAdapter = null;
        try
        {
            bcViewAdapter = new BCViewAdapter(getApplicationContext(), filter);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        bcRecyclerView.setAdapter(bcViewAdapter);
        Toolbar toolbar = findViewById(R.id.bcListToolbar);
        toolbar.setTitle(filter);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onBackPressed();
            }
        });
    }
}
package com.cultureambassadors.albanointour;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;

public class BCActivity extends AppCompatActivity
{
    private BCList.BC bc;
    
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_c);
        Toolbar toolbar = findViewById(R.id.bcPageToolbar);
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
        TextView nameTxt = findViewById(R.id.bcPageName);
        TextView descTxt = findViewById(R.id.bcPageDescription);
        TextView addressTxt = findViewById(R.id.bcPageAddress);
        TextView lun = findViewById(R.id.lunedi);
        TextView mar = findViewById(R.id.martedi);
        TextView mer = findViewById(R.id.mercoledi);
        TextView gio = findViewById(R.id.giovedi);
        TextView ven = findViewById(R.id.venerdi);
        TextView sab = findViewById(R.id.sabato);
        TextView dom = findViewById(R.id.domenica);
        TextView lunTxt = findViewById(R.id.lunediTxt);
        TextView marTxt = findViewById(R.id.martediTxt);
        TextView merTxt = findViewById(R.id.mercolediTxt);
        TextView gioTxt = findViewById(R.id.giovedTxt);
        TextView venTxt = findViewById(R.id.venerdiTxt);
        TextView sabTxt = findViewById(R.id.sabatoTxt);
        TextView domTxt = findViewById(R.id.domenicaTxt);
        TextView tariffeTxt = findViewById(R.id.bcPageTariffe);
        TextView durataTxt = findViewById(R.id.bcPageDurata);
        ImageView img = findViewById(R.id.bcPageImg);
        try
        {
            for (BCList.BC bc : BCList.getList())
                if (bc.getNome().equals(name))
                {
                    this.bc = bc;
                    nameTxt.setText(bc.getNome());
                    descTxt.setText(bc.getDescrizione());
                    addressTxt.setText(bc.getIndirizzo());
                    int giorno_attuale = 0;
                    Calendar calendar = Calendar.getInstance();
                    int day = calendar.get(Calendar.DAY_OF_WEEK);
                    switch (day)
                    {
                        case Calendar.MONDAY:
                            giorno_attuale = 0;
                            break;
                        case Calendar.TUESDAY:
                            giorno_attuale = 1;
                            break;
                        case Calendar.WEDNESDAY:
                            giorno_attuale = 2;
                            break;
                        case Calendar.THURSDAY:
                            giorno_attuale = 3;
                            break;
                        case Calendar.FRIDAY:
                            giorno_attuale = 4;
                            break;
                        case Calendar.SATURDAY:
                            giorno_attuale = 5;
                            break;
                        case Calendar.SUNDAY:
                            giorno_attuale = 6;
                            break;
                    }
                    ArrayList<String> orari = bc.getOrariString();
                    for (int i = 0; i < orari.size(); i++)
                    {
                        String orario = orari.get(i).replace(";", "; ");
                        switch (i)
                        {
                            case 0:
                                lun.setText(orario);
                                if (i == giorno_attuale)
                                {
                                    lunTxt.setTypeface(null, Typeface.BOLD);
                                    lun.setTypeface(null, Typeface.BOLD);
                                }
                                break;
                            case 1:
                                mar.setText(orario);
                                if (i == giorno_attuale)
                                {
                                    marTxt.setTypeface(null, Typeface.BOLD);
                                    mar.setTypeface(null, Typeface.BOLD);
                                }
                                break;
                            case 2:
                                mer.setText(orario);
                                if (i == giorno_attuale)
                                {
                                    merTxt.setTypeface(null, Typeface.BOLD);
                                    mer.setTypeface(null, Typeface.BOLD);
                                }
                                break;
                            case 3:
                                gio.setText(orario);
                                if (i == giorno_attuale)
                                {
                                    gioTxt.setTypeface(null, Typeface.BOLD);
                                    gio.setTypeface(null, Typeface.BOLD);
                                }
                                break;
                            case 4:
                                ven.setText(orari.get(i));
                                if (i == giorno_attuale)
                                {
                                    venTxt.setTypeface(null, Typeface.BOLD);
                                    ven.setTypeface(null, Typeface.BOLD);
                                }
                                break;
                            case 5:
                                sab.setText(orari.get(i));
                                if (i == giorno_attuale)
                                {
                                    sabTxt.setTypeface(null, Typeface.BOLD);
                                    sab.setTypeface(null, Typeface.BOLD);
                                }
                                break;
                            case 6:
                                dom.setText(orari.get(i));
                                if (i == giorno_attuale)
                                {
                                    domTxt.setTypeface(null, Typeface.BOLD);
                                    dom.setTypeface(null, Typeface.BOLD);
                                }
                                break;
                        }
                    }
                    tariffeTxt.setText(bc.getTariffe());
                    durataTxt.setText(bc.getDurataString());
                    img.setImageResource(getResources().getIdentifier(bc.getImg(), "drawable", getPackageName()));
                    break;
                }
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        Button recensioniBtn = findViewById(R.id.recensioniBtn);
        Button covidBtn = findViewById(R.id.covidBtn);
        recensioniBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), RecensioneActivity.class);
                i.putExtra("name", bc.getNome());
                startActivity(i);
            }
        });
        covidBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), Normative_AntiCovid.class));
            }
        });
    }
}

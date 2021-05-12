package com.cultureambassadors.albanointour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.cultureambassadors.albanointour.BCListActivity;
import com.cultureambassadors.albanointour.R;


public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_AlbanoInTour);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void startList(View view){
        Intent intent = new Intent(this, BCListActivity.class);
        if (view.getId() != R.id.mainButtonList) {
            String[] filters = getResources().getStringArray(R.array.filters);
            String filter = "";
            if (view.getId() == R.id.mainCardEdificiReligiosi)
                intent.putExtra("filter", filters[0]);
            else if (view.getId() == R.id.mainCardEdificiStorici)
                intent.putExtra("filter", filters[1]);
            else if (view.getId() == R.id.mainCardMostre)
                intent.putExtra("filter", filters[2]);
            else if (view.getId() == R.id.mainCardMusei)
                intent.putExtra("filter", filters[3]);
            else if (view.getId() == R.id.mainCardEventiCulturali)
                intent.putExtra("filter", filters[4]);
            else if (view.getId() == R.id.mainCardParchi)
                intent.putExtra("filter", filters[5]);
        }
        startActivity(intent);
        
    }
}

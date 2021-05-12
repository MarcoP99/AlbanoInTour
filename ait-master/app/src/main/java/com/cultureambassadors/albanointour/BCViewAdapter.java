package com.cultureambassadors.albanointour;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import static java.time.temporal.ChronoUnit.MINUTES;

public class BCViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private ArrayList<BCList.BC> filteredBc = new ArrayList<BCList.BC>();
    private Context context;
    
    @RequiresApi(api = Build.VERSION_CODES.O)
    public BCViewAdapter(Context context, String filter) throws ParseException
    {
        this.context = context;
        filter(filter);
    }
    
    @RequiresApi(api = Build.VERSION_CODES.O)
    private void filter(String filter) throws ParseException
    {
        ArrayList<BCList.BC> allBc = BCList.getList();
        if (filter.equals("Lista dei beni culturali"))
            filteredBc = allBc;
        else
            for (BCList.BC bc : allBc)
                if (bc.getTipo().equals(filter))
                    filteredBc.add(bc);
    }
    
    @Override
    public int getItemViewType(int position)
    {
        return position == 0 ? 0 : 1;
    }
    
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        switch (viewType)
        {
            case 0:
                return new SuggestedViewHolder(LayoutInflater.from(context).inflate(R.layout.suggested_item, parent, false));
            case 1:
                return new BCViewHolder(LayoutInflater.from(context).inflate(R.layout.bc_item, parent, false));
        }
        return null;
    }
    
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        switch (holder.getItemViewType())
        {
            case 0:
                BCList.BC randomBC = null;
                try
                {
                    randomBC = BCList.getList().get(new Random().nextInt(BCList.getSize()));
                } catch (ParseException e)
                {
                    e.printStackTrace();
                }
                ((SuggestedViewHolder) holder).name.setText(randomBC.getNome());
                ((SuggestedViewHolder) holder).img.setImageResource(context.getResources().getIdentifier(randomBC.getImg(), "drawable", context.getPackageName()));
                break;
            case 1:
                ((BCViewHolder) holder).name.setText(filteredBc.get(position - 1).getNome());
                ((BCViewHolder) holder).img.setImageDrawable(context.getResources().getDrawable(context.getResources().getIdentifier(filteredBc.get(position - 1).getImg(), "drawable", context.getPackageName())));
                Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_WEEK);
                String orario = "ND";
                ArrayList<LocalTime[]> times = new ArrayList<>();
                String open;
                switch (day)
                {
                    case Calendar.MONDAY:
                        orario = filteredBc.get(position - 1).getOrariString().get(0);
                        times = filteredBc.get(position - 1).getOrariDates().get("lunedì:");
                        break;
                    case Calendar.TUESDAY:
                        orario = filteredBc.get(position - 1).getOrariString().get(1);
                        times = filteredBc.get(position - 1).getOrariDates().get("martedì:");
                        break;
                    case Calendar.WEDNESDAY:
                        orario = filteredBc.get(position - 1).getOrariString().get(2);
                        times = filteredBc.get(position - 1).getOrariDates().get("marcoledì:");
                        break;
                    case Calendar.THURSDAY:
                        orario = filteredBc.get(position - 1).getOrariString().get(3);
                        times = filteredBc.get(position - 1).getOrariDates().get("giovedì:");
                        break;
                    case Calendar.FRIDAY:
                        orario = filteredBc.get(position - 1).getOrariString().get(4);
                        times = filteredBc.get(position - 1).getOrariDates().get("venerdì:");
                        break;
                    case Calendar.SATURDAY:
                        orario = filteredBc.get(position - 1).getOrariString().get(5);
                        times = filteredBc.get(position - 1).getOrariDates().get("sabato:");
                        break;
                    case Calendar.SUNDAY:
                        orario = filteredBc.get(position - 1).getOrariString().get(6);
                        times = filteredBc.get(position - 1).getOrariDates().get("domenica:");
                        break;
                }
                open = checkOpen(times, filteredBc.get(position - 1).getDurataLocalTime());
                ((BCViewHolder) holder).info.setText("Oggi: " + orario + "\nDurata: " + filteredBc.get(position - 1).getDurataString());
                ((BCViewHolder) holder).open_close.setText(open);
                if (open.equals("Chiuso"))
                    ((BCViewHolder) holder).open_close.setTextColor(holder.itemView.getResources().getColor(R.color.red));
                else if (open.equals("In chiusura"))
                    ((BCViewHolder) holder).open_close.setTextColor(holder.itemView.getResources().getColor(R.color.orange));
                else
                    ((BCViewHolder) holder).open_close.setTextColor(holder.itemView.getResources().getColor(R.color.green));
                break;
        }
    }
    
    @RequiresApi(api = Build.VERSION_CODES.O)
    private String checkOpen(ArrayList<LocalTime[]> times, LocalTime durata)
    {
        String open;
        if (times == null)
        {
            return "";
        }
        else if (times.size() == 0)
            return "Chiuso";
        else
        {
            LocalTime now = LocalTime.now();
            for (LocalTime[] ora : times)
            {
                if (now.isAfter(ora[0]) && now.isBefore(ora[1]))
                {
                    if (durata!=null)
                    {
                        int durataInMinuti = durata.getHour() * 60 + durata.getMinute();
                        if (MINUTES.between(now, ora[1]) < durataInMinuti)
                            return "In chiusura";
                        else
                            return "Aperto";
                    }
                    else
                        return "Aperto";
                }
            }
        }
        return "Chiuso";
    }
    
    @Override
    public int getItemCount()
    {
        return filteredBc.size() + 1;
    }
    
    public class BCViewHolder extends RecyclerView.ViewHolder
    {
        private TextView name, info, open_close;
        private ImageView img;
        private Button toInfo;
        
        public BCViewHolder(@NonNull View itemView)
        {
            super(itemView);
            name = itemView.findViewById(R.id.bcListName);
            info = itemView.findViewById(R.id.bcListInfo);
            img = itemView.findViewById(R.id.bcListImg);
            open_close = itemView.findViewById(R.id.bc_open_close);
            toInfo = itemView.findViewById(R.id.toInfoBtn);
            toInfo.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent i = new Intent(context, BCActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.putExtra("name", name.getText().toString());
                    context.startActivity(i);
                }
            });
        }
    }
    
    public class SuggestedViewHolder extends RecyclerView.ViewHolder
    {
        private TextView name;
        private ImageView img;
        private Button toInfo;
        
        public SuggestedViewHolder(@NonNull View itemView)
        {
            super(itemView);
            name = itemView.findViewById(R.id.suggestedName);
            img = itemView.findViewById(R.id.suggestedImg);
            toInfo = itemView.findViewById(R.id.suggestedToInfoBtn);
            toInfo.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent i = new Intent(v.getContext(), BCActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.putExtra("name", name.getText().toString());
                    v.getContext().startActivity(i);
                }
            });
        }
    }
}

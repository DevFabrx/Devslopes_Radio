package com.example.fabian.devslopesradio.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fabian.devslopesradio.Activities.MainActivity;
import com.example.fabian.devslopesradio.Holders.StationViewHolder;
import com.example.fabian.devslopesradio.R;
import com.example.fabian.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by Fabian on 11.08.2016.
 */
public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, final int position) {
        final Station station = stations.get(position);
        holder.updateUI(station);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Load the details screen

                MainActivity.getMainActivity().loadDetailsScreen(station);

            }
        });
    }


    @Override
    public int getItemCount() {

        return stations.size();
    }


    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);

        return new StationViewHolder(stationCard);
    }
}



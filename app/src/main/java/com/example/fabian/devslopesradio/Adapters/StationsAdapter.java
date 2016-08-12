package com.example.fabian.devslopesradio.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.fabian.devslopesradio.Holders.StationViewHolder;
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
    public void onBindViewHolder(StationViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }


    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }
}



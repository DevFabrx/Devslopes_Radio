package com.example.fabian.devslopesradio.Fragments;


import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fabian.devslopesradio.Adapters.StationsAdapter;
import com.example.fabian.devslopesradio.R;
import com.example.fabian.devslopesradio.services.DataService;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StationsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StationsFragment extends Fragment {

    private static final String ARG_STATION_TYPE = "station_type";


    public static final int STATION_TYPE_FEATURED = 0;
    public static final int STATION_TYPE_RECENT = 1;
    public static final int STATION_TYPE_PARTY = 2;

    private int stationType;


    public StationsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param stationType The Radio Stations Type.
     * @return A new instance of fragment StationsFragment.
     */

    public static StationsFragment newInstance(int stationType) {
        StationsFragment fragment = new StationsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_STATION_TYPE, stationType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            stationType = getArguments().getInt(ARG_STATION_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_stations, container, false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycler_stations);
        recyclerView.setHasFixedSize(true);


        StationsAdapter adapter;

        if (stationType == STATION_TYPE_FEATURED){
            adapter = new StationsAdapter(DataService.getInstance().getFeaturedStations());
            TextView featuresTextView = (TextView)getActivity().findViewById(R.id.featuresText);
            TextView featuresTextView_below = (TextView) getActivity().findViewById(R.id.featuresText_below);
            featuresTextView.setText("It's Monday evening");
            featuresTextView_below.setText("Play something for...");

        } else if (stationType == STATION_TYPE_RECENT){
            adapter = new StationsAdapter(DataService.getInstance().getFeaturedStations());
            TextView recentTextView = (TextView)getActivity().findViewById(R.id.recentText);
            TextView recentTextView_below = (TextView) getActivity().findViewById(R.id.recentText_below);
            recentTextView.setText("Recent Activity");
            recentTextView_below.setText("Recently played or added");
        } else {
            adapter = new StationsAdapter(DataService.getInstance().getFeaturedStations());
            TextView bottomTextView = (TextView)getActivity().findViewById(R.id.bottomText);
            TextView bottomTextView_below = (TextView)getActivity().findViewById(R.id.bottomText_bottom);
            bottomTextView.setText("This is the bottom line");
            bottomTextView_below.setText("This is the line beneath the bottom line");
        }

        recyclerView.addItemDecoration(new HorizontalSpaceItemDecorator(30));
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        return v;
    }

}

class HorizontalSpaceItemDecorator extends RecyclerView.ItemDecoration {
    private final int spacer;

    public HorizontalSpaceItemDecorator(int spacer) {
        this.spacer = spacer;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.right = spacer;
    }
}

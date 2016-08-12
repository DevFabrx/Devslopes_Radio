package com.example.fabian.devslopesradio.services;

import com.example.fabian.devslopesradio.model.Station;

import java.util.ArrayList;

/**
 * Created by Fabian on 12.08.2016.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {

        return ourInstance;

    }

    private DataService() {



    }

    public ArrayList<Station> getFeaturedStations(){

        // Pretend we just downloaded featured stations from the internet

        ArrayList<Station> list = new ArrayList<>();

        list.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheeling' (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Kinds Jams (Music for Children)","kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations(){
        ArrayList<Station> list = new ArrayList<>();
        return list;

    }

    public ArrayList<Station> getPartyStations(){
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }
}

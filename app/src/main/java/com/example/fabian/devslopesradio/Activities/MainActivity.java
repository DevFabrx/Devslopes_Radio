package com.example.fabian.devslopesradio.Activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.fabian.devslopesradio.Fragments.DetailsFragment;
import com.example.fabian.devslopesradio.Fragments.MainFragment;
import com.example.fabian.devslopesradio.R;
import com.example.fabian.devslopesradio.model.Station;

public class MainActivity extends AppCompatActivity {

    private static MainActivity mainActivity;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity.setMainActivity(this);

        FragmentManager manager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) manager.findFragmentById(R.id.fragment_container);


        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance("bla", "kah");
            manager.beginTransaction().add(R.id.fragment_container,mainFragment).commit();
        }




    }

    public void loadDetailsScreen(Station selectedStation){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DetailsFragment()).addToBackStack(null).commit();
    }

}


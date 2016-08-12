package com.example.fabian.devslopesradio.Activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.fabian.devslopesradio.Fragments.MainFragment;
import com.example.fabian.devslopesradio.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) manager.findFragmentById(R.id.fragment_container);


        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance("bla", "kah");
        }

            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fragment_container,mainFragment).commit();


    }

}


package com.talk.hwanungyu.and_firebasetalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.talk.hwanungyu.and_firebasetalk.fragment.Peoplefragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction().replace(R.id.mainActivity_framelayout, new Peoplefragment()).commit();
    }
}

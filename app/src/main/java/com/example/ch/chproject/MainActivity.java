package com.example.ch.chproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String ch = "chenhao";
        Log.i("","guo");
        Log.i("","ZhaoKai");
        Toast.makeText(MainActivity.this,"Optimus Primal",Toast.LENGTH_LONG).show();

    }
}

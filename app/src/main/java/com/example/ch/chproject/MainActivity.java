package com.example.ch.chproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String wxy = "王鑫雨 has been here";
        Log.i("","guo");
        System.out.println("changhua");
        Log.i("","ZhaoKai");
        Log.i("","DiLongGe");
        Toast.makeText(MainActivity.this,"Optimus Primal",Toast.LENGTH_LONG).show();
        Log.i("----------","张洋");
        System.out.println("jianjian123456789");

    }
}

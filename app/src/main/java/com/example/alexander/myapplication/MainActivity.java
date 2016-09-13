package com.example.alexander.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.calldorado.Calldorado;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Calldorado.startCalldorado(this);
    }

    public void launchCalldoradoSettings(View view) {
        Calldorado.createCalloradoSettingsActivity(this);
    }
}

package com.pdm.eventlistiner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import  com.pdm.eventlistiner.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private  ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(view);

        //click event
        mainBinding.clickBtn.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mainBinding.resultadoTv.setText("Click Simples");
                    }
                }
        );

        //long Click Event
        mainBinding.clickBtn.setOnLongClickListener(
                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        mainBinding.resultadoTv.setText("Lonnnngggg Click");
                        return false;
                    }
                }
        );


    }

}
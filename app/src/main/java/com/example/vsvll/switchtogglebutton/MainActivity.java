package com.example.vsvll.switchtogglebutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    ToggleButton toggleButton;
    Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        aSwitch = findViewById(R.id.switch1);

        relativeLayout =findViewById(R.id.relativeLayout);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(toggleButton.isChecked() && aSwitch.isChecked()){

                    relativeLayout.setBackgroundColor(Color.GREEN);

                }

                else if (toggleButton.isChecked()) {

                    relativeLayout.setBackgroundColor(Color.BLUE);
                }

                else if (aSwitch.isChecked()) {

                    relativeLayout.setBackgroundColor(Color.YELLOW);
                }


                else {
                    relativeLayout.setBackgroundColor(Color.BLACK);

                }
            }

        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(toggleButton.isChecked() && aSwitch.isChecked()){

                    relativeLayout.setBackgroundColor(Color.GREEN);

                }


                else if (aSwitch.isChecked()) {

                    relativeLayout.setBackgroundColor(Color.YELLOW);
                }

                else if (toggleButton.isChecked()) {

                    relativeLayout.setBackgroundColor(Color.BLUE);
                }

                else {
                    relativeLayout.setBackgroundColor(Color.BLACK);

                }

            }
        });

        }
    }



package io.sensesation.sensation.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import io.sensesation.sensation.R;

/**
 * Created by joaop on 31/10/2016.
 */

public class Main_Activity extends AppCompatActivity {

    private Toolbar tbMain;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
    }

    private void setUI(){
        tbMain = (Toolbar) findViewById(R.id.tbMain);
        setSupportActionBar(tbMain);
       // tbMain.setBackgroundResource(R.mipmap.app_icon);
        tbMain.setTitle(getApplicationContext().getResources().getString(R.string.app_name));
    }
}

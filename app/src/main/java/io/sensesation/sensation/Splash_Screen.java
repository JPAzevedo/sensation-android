package io.sensesation.sensation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash_Screen extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        setUI();
    }

    private void setUI(){
       mButton = (Button) findViewById(R.id.bEnter);
       setUIAction();
    }

    private void setUIAction(){
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Splash_Screen.this,Main_Activity.class);
                startActivity(mIntent);
            }
        });
    }
}

package com.sumayea.traveljam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Splash_Screen extends AppCompatActivity {


    int progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                doWork();
                startApp();
                finish();
            }
        });

        thread.start();
    }
    public void doWork(){
        for (progress= 50; progress<=100; progress=progress+10){
            try {
                Thread.sleep(400);
                //ProgressBar.setProgress(progress);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void startApp(){
        Intent intent = new Intent(Splash_Screen.this,MainActivity.class);
        startActivity(intent);

    }
}

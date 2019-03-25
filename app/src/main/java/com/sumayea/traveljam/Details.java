package com.sumayea.traveljam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    //variable declare
    private ImageView imageView;
    private TextView textView1;
    private TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView= findViewById(R.id.image_detail);
        textView1 = findViewById(R.id.placeName);
        textView2 =findViewById(R.id.placeDetail);


        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            setTitle(bundle.getString("placeName"));
            textView1.setText(bundle.getString("placeName"));
            textView2.setText(bundle.getString("placeDetail"));
            imageView.setImageResource(bundle.getInt("pic"));
        }
    }
}

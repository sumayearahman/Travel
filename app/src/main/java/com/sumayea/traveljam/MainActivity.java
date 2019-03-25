package com.sumayea.traveljam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String [] placeName;
    private String[] placeDetail;
    private int[] pic={R.drawable.arialbil,
            R.drawable.monubari,
            R.drawable.sajek,
            R.drawable.kaptai,
            R.drawable.haor,
            R.drawable.jomidarbari,
            R.drawable.chondronath,
            R.drawable.sonadia,
            R.drawable.panam
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= findViewById(R.id.place_list);

        placeName = getResources().getStringArray(R.array.placeName);
        placeDetail = getResources().getStringArray(R.array.placeDetail);

        //creating a custom adapter
        CustomAdapter adapter = new CustomAdapter(this,placeName, placeDetail,pic);
        listView.setAdapter(adapter);

        //set onItem click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,Details.class);
                intent.putExtra("placeName",placeName[i]);
                intent.putExtra("placeDetail",placeDetail[i]);
                intent.putExtra("pic", pic[i]);
                startActivity(intent);
            }
        });




    }
}

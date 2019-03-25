package com.sumayea.traveljam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {

    String[] placeName;
    String[] placeDetails;
    int[] pic;
    Context context;

    private LayoutInflater inflater;

    CustomAdapter (Context context, String[]placeName, String[] placeDetails,int[]pic) {
        this.context= context;
        this.pic=pic;
        this.placeName=placeName;
        this.placeDetails = placeDetails;
    }
    @Override
    public int getCount() {
        return placeName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
           inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           view= inflater.inflate(R.layout.place_list,viewGroup,false);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView textView = (TextView) view.findViewById(R.id.title);
        imageView.setImageResource(pic[i]);
        textView.setText(placeName[i]);

        return view;
    }
}

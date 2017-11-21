package com.example.user.customlistviewwithimage;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 11/21/2017.
 */

public class TextImageAdapter extends ArrayAdapter<String>
{
    //---We need to use this thing here---
    private final Activity activity;
    private final Integer [] image;
    private final String  [] prog;

    public TextImageAdapter( Activity activity, Integer[] image, String[] prog) {

        //This is for extened ArrayAdapter constructor
        super(activity,R.layout.activity_seperate_text_image__view,prog);
        this.activity = activity;
        this.image = image;
        this.prog = prog;
    }

   //This will a call from MainActivity to get each text & Image View
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //To get /connect another layout/xml filt we need to use LayoutInFlate
        LayoutInflater inflater=activity.getLayoutInflater();

        //After connect we need to ( inflate-->fill ) some info using Inflater
        View view =inflater.inflate(R.layout.activity_seperate_text_image__view,null,true);
        //After that we can access this layout
        ImageView img=(ImageView)view.findViewById(R.id.image);
        TextView txt=(TextView)view.findViewById(R.id.txt);
        img.setImageResource(image[position]);
        txt.setText(prog[position]);
        return view;
    }
}

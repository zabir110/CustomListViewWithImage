package com.example.user.customlistviewwithimage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    //For using anywhere work with Adapter we need Context
    Context context;
    ArrayAdapter arrayAdapter;
    //Static use it from anywhere
    public static String  [] prognames={" Object"," Polymorphism"," OOP"," Abstract",
            " Inheritence"," Interface"," Thread"," Array"," Class"," Constructor"," Swing"," File"};

    public  static Integer[] progimages={
            R.drawable.download,R.drawable.images,R.drawable.images1,
            R.drawable.download2,R.drawable.images11,R.drawable.images33,
            R.drawable.download3,R.drawable.images33,R.drawable.images22,
            R.drawable.download,R.drawable.images,R.drawable.images1

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.listview);
        TextImageAdapter adapter=new TextImageAdapter(this,progimages,prognames);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"You are interested "+ prognames[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.yasser.thefirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3_3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_3);
    }


    public void show(View view) {
        ListView lseng=(ListView)findViewById(R.id.listView);
        ListView lsar=(ListView)findViewById(R.id.listView2);
        DBconiction db=new DBconiction(this);
        ArrayList<String>arreng=db.geteng();
        lseng.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arreng));
        ArrayList<String>arrar=db.getar();
        lsar.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrar));

    }
}

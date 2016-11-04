package com.example.yasser.thefirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_2);
    }



    public void ser(View view) {
        EditText t=(EditText)findViewById(R.id.editText4);
        Button b=(Button)findViewById(R.id.button4);
        ListView l=(ListView)findViewById(R.id.listView3);
        DBconiction db=new DBconiction(this);
        ArrayList<String> arr=db.searc(t.getText().toString());
        l.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr));
t.setText("");
    }

}

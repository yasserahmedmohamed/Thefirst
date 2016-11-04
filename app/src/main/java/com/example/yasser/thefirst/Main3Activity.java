package com.example.yasser.thefirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void add_word(View view) {
        Intent add=new Intent(this,Main3_1Activity.class);
        startActivity(add);

    }

    public void search(View view) {
        Intent search=new Intent(this,Main3_2Activity.class);
        startActivity(search);
    }

    public void display(View view) {
        Intent dis=new Intent(this,Main3_3Activity.class);
        startActivity(dis);
    }

    public void delete(View view) {
        Intent intent=new Intent(this,Main3_4Activity.class);
        startActivity(intent);
    }
}

package com.example.yasser.thefirst;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void translate_page(View view) {
        Intent intent1=new Intent(this,MainActivity.class);
        startActivity(intent1);
    }

    public void dic(View view) {
        Intent intent2=new Intent(this,Main3Activity.class);
        startActivity(intent2);
    }

    public void say2(View view) {
        Intent intent3=new Intent(this,Main4Activity.class);
        startActivity(intent3);

    }
}

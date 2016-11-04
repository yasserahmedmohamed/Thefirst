package com.example.yasser.thefirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.yasser.thefirst.R.id.word;

public class Main3_4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_4);
    }

    public void det(View view) {
        DBconiction db=new DBconiction(this);
        EditText t=(EditText)findViewById(word);
        db.delet(t.getText().toString());
        t.setText("");

    }
}

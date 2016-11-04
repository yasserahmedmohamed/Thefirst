package com.example.yasser.thefirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main3_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_1);
    }

    public void save(View view) {
        EditText eng=(EditText)findViewById(R.id.editText3);
        EditText ar=(EditText)findViewById(R.id.editText2);
        DBconiction db=new DBconiction(this);
        db.add_words(eng.getText().toString(),ar.getText().toString());
eng.setText("");
        ar.setText("");
    }
}

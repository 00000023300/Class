package com.example.aclass.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.aclass.R;

public class TextActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        textView = findViewById(R.id.text);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("text");
        textView.setText(name);




    }
}

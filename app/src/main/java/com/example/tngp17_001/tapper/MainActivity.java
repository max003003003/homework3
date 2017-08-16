package com.example.tngp17_001.tapper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgPlay;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiateInstance();
    }

    private void initiateInstance() {
        imgPlay = (ImageView) findViewById(R.id.imgPlay);
        editText = (EditText) findViewById(R.id.etPlay);
        imgPlay.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v == imgPlay) {
            if (!editText.getText().toString().isEmpty()) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("limitClick", Integer.parseInt(editText.getText().toString()));
                startActivity(intent);

            }
        }


    }
}

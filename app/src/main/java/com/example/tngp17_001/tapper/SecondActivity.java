package com.example.tngp17_001.tapper;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvClick;
    private ImageView imgCoin;

    private int limitClick = 0;
    private int counting = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapper);
        initiateInstance();
    }

    private void initiateInstance() {
        limitClick = getIntent().getIntExtra("limitClick", 0);
        tvClick = (TextView) findViewById(R.id.tvClick);
        imgCoin = (ImageView) findViewById(R.id.btnCoin);
        tvClick.setText(counting + "");
        imgCoin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == imgCoin) {
            counting++;
            tvClick.setText(counting + "");

            if (counting == limitClick) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);

            }

        }
    }
}

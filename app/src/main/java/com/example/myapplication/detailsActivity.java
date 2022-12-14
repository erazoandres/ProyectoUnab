package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class detailsActivity extends AppCompatActivity {

    private ImageView img;
    private TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        img = findViewById(R.id.image);
        txt1 = findViewById(R.id.textName);
        txt2 = findViewById(R.id.textDescription);
        txt3 = findViewById(R.id.textPrice);

        Intent intent = getIntent();

       /* txt1.setText(intent.getStringExtra("name"));
        txt2.setText(intent.getStringExtra("descr"));
        txt3.setText(intent.getStringExtra("price"));
*/
    }
}
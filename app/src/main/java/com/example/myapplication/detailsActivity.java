package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class detailsActivity extends AppCompatActivity {

    private ImageView img,img2,img3;
    private TextView txt,txt2,txt3;
    private Button btn,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);




        Intent bund = getIntent();
        img.setImageResource(bund.getIntExtra("img",0));
        txt.setText(bund.getStringExtra("title"));


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), listActivity.class);
                startActivity(intent);
            }
        });

    }
}
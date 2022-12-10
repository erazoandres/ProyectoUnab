package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button btn1  , btn2 , btn3 ;
    private TextView t1 , t2 , t3 ;
    private ImageView i1, i2, i3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.buttonList);
        btn2 = findViewById(R.id.buttonList2);
        btn3 = findViewById(R.id.buttonList3);

        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);

        i1 = (ImageView) findViewById(R.id.imageView1);
        i2 = (ImageView) findViewById(R.id.imageView2);
        i3 = (ImageView) findViewById(R.id.imageView3);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext() , MainActivity3.class);
                int1.putExtra("title",t1.getText().toString());
                int1.putExtra("img",R.drawable.i1);
                startActivity(int1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(getApplicationContext() , MainActivity3.class);
                int2.putExtra("title",t2.getText().toString());
                int2.putExtra("img",R.drawable.i2);
                startActivity(int2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(getApplicationContext() , MainActivity3.class);
                int3.putExtra("title",t3.getText().toString());
                int3.putExtra("img",R.drawable.i3);
                startActivity(int3);
            }
        });


    }
}
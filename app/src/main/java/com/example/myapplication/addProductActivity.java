package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

<<<<<<<< HEAD:app/src/main/java/com/example/myapplication/template_product.java
public class template_product extends AppCompatActivity {
========
public class addProductActivity extends AppCompatActivity {
>>>>>>>> 14fe2f2efe2dee95a7e0b54e6c21182158499826:app/src/main/java/com/example/myapplication/addProductActivity.java

    private ImageView img;
    private TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_product);

        img = findViewById(R.id.image);
        txt1 = findViewById(R.id.textName);
        txt2 = findViewById(R.id.textDescription);
        txt3 = findViewById(R.id.textPrice);

        Intent intent = getIntent();
        txt1.setText(intent.getStringExtra("name"));

        /*
        txt2.setText(intent.getStringExtra("descr"));
        txt3.setText(intent.getStringExtra("price"));
        */
    }
}
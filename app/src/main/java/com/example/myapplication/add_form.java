package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.myapplication.db.DBFireBase;
import com.example.myapplication.entities.Producto;

public class add_form extends AppCompatActivity {

    private ImageView image;
    private EditText name;
    private EditText description;
    private EditText price;
    private Button btnBack , buttonRetroceder;
    private DBFireBase bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_form);


        image = (ImageView) findViewById(R.id.image);
        name = (EditText) findViewById(R.id.editName);
        description = (EditText) findViewById(R.id.editDescription);
        price = (EditText) findViewById(R.id.editPrice);
        btnBack = (Button) findViewById(R.id.buttonBack);
        buttonRetroceder = (Button) findViewById(R.id.buttonRetroceder);
        bd = new DBFireBase();


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Producto prod = new Producto(name.getText().toString(),
                        description.getText().toString(),
                        Integer.parseInt(price.getText().toString()),
                        R.drawable.i2
                        );

                bd.insertData(prod);

                Intent intent = new Intent(getApplicationContext() , listActivity.class);
                startActivity(intent);
            }
        });

        buttonRetroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2  = new Intent(getApplicationContext() , listActivity.class);
                startActivity(intent2);
            }
        });
    }
}
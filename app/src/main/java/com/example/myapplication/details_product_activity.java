package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class details_product_activity extends AppCompatActivity {

    private ImageView image;
    private TextView name , description , price;
    private FirebaseFirestore db;
    private CollectionReference productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_product);

        db = FirebaseFirestore.getInstance();
        productos = db.collection("productos");
        setup();

    }

    private void setup(){
        name = findViewById(R.id.viewProductName);
        description = findViewById(R.id.viewProductDescription);
        price = findViewById(R.id.viewProductPrice);
    }

    public void volver(){
        setResult(RESULT_CANCELED);
        finish();
    }

    public void guardar(View view){
        String name1 = name.getText().toString();
        String description1 = description.getText().toString();
        String price1 = price.getText().toString();

        if (TextUtils.isEmpty(name1)){
            name.setError("campo obligatorio");
        }
    }
}
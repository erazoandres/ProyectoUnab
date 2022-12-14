package com.example.myapplication.db;

import com.example.myapplication.entities.Producto;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class DBFireBase {
    private FirebaseFirestore db;

    public DBFireBase(){
        this.db =  FirebaseFirestore.getInstance();
    }

    public void insertData(Producto producto){
        // Create a new user with a first and last name
        Map<String, Object> prod = new HashMap<>();
        prod.put("name", producto.getName());
        prod.put("descr", producto.getDescription());
        prod.put("price", producto.getPrice());
        prod.put("image",producto.getImage());

        // Add a new document with a generated ID
        db.collection("productos").add(prod) ;
    }





    }

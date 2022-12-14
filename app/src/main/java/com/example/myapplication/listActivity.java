package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.adapter.adapter;
import com.example.myapplication.entities.producto;

import java.util.ArrayList;

public class listActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<producto> arrayList;
    private adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        listView = (ListView) findViewById(R.id.listViewProducts);
        arrayList = new ArrayList<>();

        producto producto1 = new producto("Coco","fruta",12000,R.drawable.i1);
        producto producto2 = new producto("fresa","fruta",19000,R.drawable.i2);
        producto producto3 = new producto("mora","fruta",18000,R.drawable.i3);

        arrayList.add(producto1);
        arrayList.add(producto2);
        arrayList.add(producto3);

        adapter = new adapter(this , arrayList);
        listView.setAdapter(adapter);


    }
}
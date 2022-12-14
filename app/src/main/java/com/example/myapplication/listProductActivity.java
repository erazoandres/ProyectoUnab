package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.myapplication.adapter.adapter;
import com.example.myapplication.db.DBFireBase;
import com.example.myapplication.entities.Producto;

import java.util.ArrayList;

public class listActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Producto> arrayList;
    private DBFireBase bd;
    private adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        listView = (ListView) findViewById(R.id.listViewProducts);
        arrayList = new ArrayList<>();
        bd = new DBFireBase();
/*
        Producto producto1 = new Producto("Coco","fruta",12000,R.drawable.i1);
        Producto producto2 = new Producto("fresa","fruta",19000,R.drawable.i2);
        Producto producto3 = new Producto("mora","fruta",18000,R.drawable.i3);

        bd.insertData(producto1);
        bd.insertData(producto2);
        bd.insertData(producto3);
        bd.insertData(producto2);
        bd.insertData(producto3);
        arrayList.add(producto1);
        arrayList.add(producto2);
        arrayList.add(producto3);
*/
        adapter = new adapter(this , arrayList);
        listView.setAdapter(adapter);

        bd.getData(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu); ;
        return super.onCreateOptionsMenu(menu);
    }

    @Override

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item:
                Intent intent = new Intent(getApplicationContext() , productAddActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

}
package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.entities.Producto;

import java.util.ArrayList;

public class adapter extends BaseAdapter{

    private Context context;
    private ArrayList<Producto> arrayProduct;

    public adapter(Context context, ArrayList<Producto> arrayProduct) {
        this.context = context;
        this.arrayProduct = arrayProduct;
    }


    @Override
    public int getCount() {
        return arrayProduct.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayProduct.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return Long.valueOf(arrayProduct.get(i).getName());
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.details,null);

        ImageView image = (ImageView) view.findViewById(R.id.imageView9);
        TextView textName = (TextView) view.findViewById(R.id.textName);
        TextView textDescription = (TextView) view.findViewById(R.id.textDescription);
        TextView textPrice = (TextView) view.findViewById(R.id.textPrice);

        Producto products1 = arrayProduct.get(i);

        image.setImageResource(products1.getImage());
        textName.setText(products1.getName());
        textDescription.setText(products1.getDescription());
        textPrice.setText(String.valueOf(products1.getPrice()));

        return view;
    }
}

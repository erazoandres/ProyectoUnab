package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    private TextView name , last , pass ;
    private EditText nameE , lastE, passE ;
    private Button submit;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** ENLAZANDO CON BOTENES */

        name = (TextView) findViewById(R.id.textName);
        last = (TextView) findViewById(R.id.textLastName);
        pass = (TextView) findViewById(R.id.textPass);

        nameE = (EditText) findViewById(R.id.editName);
        lastE = (EditText) findViewById(R.id.editLastName);
        passE = (EditText) findViewById(R.id.editPass);

        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class) ;

                String name = nameE.getText().toString();
                String last = lastE.getText().toString();
                String full = name + " " + last;

                intent.putExtra("fullName" , full);
                startActivity(intent);
            }
        });


    }
}
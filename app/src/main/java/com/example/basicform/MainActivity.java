package com.example.basicform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void onClick (View view){
        TextView t1 = findViewById(R.id.textView1);
        TextView t2 = findViewById(R.id.textView2);
        TextView t3 = findViewById(R.id.textView3);

         EditText et1 = findViewById(R.id.firstName);
         EditText et2 = findViewById(R.id.lastName);
         EditText et3 = findViewById(R.id.emailAddress);

         t1.setText("First Name "+et1.getText().toString());
         t2.setText("Last Name "+et2.getText().toString());
         t3.setText(et3.getText().toString());


    }
}
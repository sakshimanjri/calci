package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button btn1,btn2;
EditText txt1,txt2;
TextView txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        /*
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hello World",Toast.LENGTH_SHORT).show();
            }
        });
        */
    }
    public void onClick(View view){
        int n1= Integer.parseInt(txt1.getText().toString());
        int n2=Integer.parseInt(txt2.getText().toString());
        int n3=n1+n2;
        txt3.setText(Integer.toString(n3));
        //Fuck youAndroid
    }
}

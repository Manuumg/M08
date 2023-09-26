package com.example.manu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button buttonOk;
    private TextView textData;
    private EditText textName;

    private ImageView imageView;

    private static int DELAY = 2000;
    public static String EXTRA_NUMBER

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ButtonOK = findViewById(R.Id.buttonOk);
    ButtonOK = findViewById(R.Id.textDate);
    ButtonOK = findViewById(R.Id.textName);
    buttonOK.setOnclikc




    @Override
    public void onClick(View viwe){

        new Handler(Looper, getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(EXTRA_NUMBER, textNumber.getText().toString);
                intent.putExtra(EXTRA_NUMBER, Double.parseDouble(textNumber.getText().toString));

            }
        })

        Log.d("EDITOR", buttonOK.getText().toString);
        /*AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Please enter data.");
        builder.setTitle("Warning");
        builder.setPositiveButton("Accept", null);
        builder.create().show();*/

        String tName = textName.get
    }



}
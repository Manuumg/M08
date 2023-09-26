package com.example.manu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity {

    private TextView textName2;
    private TextView textNumber2;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        textName2 = findViewByid(R.id.textName2);
        textNumber2 = findViewByid(R.id.textNumber2);
        imageView = findViewByid(R.id.imageview);

        intent i = getIntent();

        imageDuck.setOnClickListener(new View.OnClickListener()){

            public void onClick(View, view){
                imageView
            }
        }


        textName2.setText(stName);
    }
}

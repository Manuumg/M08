package com.example.responsive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ConstraintLayout constraintLayout;
    int layoutHeight = 0;
    int layoutWidth = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);

        constraintLayout = findViewById(R.id.constraintLayout);
    }
        @Override
        public void onWindowFocusChanged(boolean hasFocus) {
            //super.onWindowFocusChanged(hasFocus);
            layoutHeight = constraintLayout.getHeight();
            layoutWidth = constraintLayout.getWidth();
            //Rescale the images
            setScale(imageView1, layoutHeight);
            setScale(imageView2, layoutHeight);
            setScale(imageView3, layoutHeight);
        }
        private void setScale(ImageView img, int layoutHeight) {
            ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) img.getLayoutParams();
            float factorScale = 4.5f;
            float relation = (float)120/180;
            //change params
            params.height = (int) (layoutHeight / factorScale);
            params.width = (int) ((layoutHeight / factorScale) * relation);
            img.setLayoutParams(params);
        }

}
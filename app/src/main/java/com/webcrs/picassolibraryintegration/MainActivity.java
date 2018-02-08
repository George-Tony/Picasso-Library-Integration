package com.webcrs.picassolibraryintegration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button loadImage;

    String url = "https://images.locanto.net/1276763057/WebCRS-Travel-ERP-Software-Lowcost_3.gif";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        loadImage = findViewById(R.id.loadImage);

        loadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.with(getApplicationContext()).load(url).into(imageView);
            }
        });


    }
}

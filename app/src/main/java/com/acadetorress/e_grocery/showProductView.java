package com.acadetorress.e_grocery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class showProductView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_product_view);
        Intent intent = getIntent();
        int imageId = intent.getIntExtra("Image", 0);
//        Toast.makeText(getApplicationContext(),imageId, Toast.LENGTH_SHORT).show();
        ImageView imageContainer = findViewById(R.id.productImage);
        imageContainer.setImageResource(imageId);
        TextView item = findViewById(R.id.productText);
        item.setText(intent.getStringExtra("itemName"));
        TextView promo = findViewById(R.id.productPromo);
        promo.setText(intent.getStringExtra("itemPromo"));
    }
}
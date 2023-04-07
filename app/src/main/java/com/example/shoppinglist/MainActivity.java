package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Context context;

    private TextView productName, productInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = MainActivity.this;
    }

    public void addProduct(View view){
        ProductStorage productStorage = ProductStorage.getInstance();
        productName = findViewById(R.id.productTextView);
        productInfo = findViewById(R.id.productInfoTextView);

        Product thisProduct = new Product(String.valueOf(productName.getText()), String.valueOf(productInfo.getText()));

        productStorage.addProduct(thisProduct);
        


    }

}
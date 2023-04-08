package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ProductEditActivity extends AppCompatActivity {
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("ahhmmss");
    String timeId = dateFormat.format(calendar.getTime());
    EditText productName, productInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_edit);


    }


    public void confirmNewProduct(View view){

        ProductStorage productStorage = ProductStorage.getInstance();
        productName = findViewById(R.id.editProductName);
        productInfo = findViewById(R.id.editProductInfo);


        Product thisProduct = new Product(String.valueOf(productName.getText()), String.valueOf(productInfo.getText()), timeId);
        productStorage.addProduct(thisProduct);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);



    }


}
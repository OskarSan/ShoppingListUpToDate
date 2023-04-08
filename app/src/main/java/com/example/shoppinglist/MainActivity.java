package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Context context;

    private TextView productName, productInfo;
    private ProductStorage productStorage;
    private RecyclerView recyclerView;
    private ImageView SortByTime, SortByABC;
    private ProductListAdapter productListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = MainActivity.this;
        productStorage = ProductStorage.getInstance();

        recyclerView = findViewById(R.id.productRV);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productListAdapter = new ProductListAdapter(getApplicationContext(), productStorage.getProducts());
        recyclerView.setAdapter(productListAdapter);
        SortByTime = findViewById(R.id.TimeSortImageView);
        SortByABC = findViewById(R.id.alphabeticalSortImageView);

        SortByABC.setOnClickListener( view -> {
            productStorage.sortAlphabetically(view);
            productListAdapter.notifyDataSetChanged();
        });
        SortByTime.setOnClickListener( view -> {
            productStorage.sortByTime(view);
            productListAdapter.notifyDataSetChanged();
        });

    }

    public void addProduct(View view){

        Intent intent = new Intent(this, ProductEditActivity.class);
        startActivity(intent);

    }


}
package com.example.shoppinglist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductListAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    private Context context;
    private ArrayList<Product> products = new ArrayList<>();


    public ProductListAdapter(Context context, ArrayList<Product> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(context).inflate(R.layout.product_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.productText.setText(products.get(position).getName());
        holder.productInfoText.setText(products.get(position).getInfo());
        holder.removeImage.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();
            ProductStorage.getInstance().removeProduct(products.get(pos).getId());
            notifyItemRemoved(pos);
        });
        holder.editProduct.setText(products.get(position).getName());

        holder.editProductInfo.setText(products.get(position).getInfo());
        holder.editImage.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();


            if(holder.editProduct.getVisibility() == View.VISIBLE){
                Product product = ProductStorage.getInstance().getProductById(pos);
                product.setName(holder.editProduct.getText().toString());
                product.setInfo(holder.editProductInfo.getText().toString());
                holder.productText.setText(holder.editProduct.getText().toString());
                holder.productInfoText.setText(holder.editProductInfo.getText().toString());
                holder.editProduct.setVisibility(View.INVISIBLE);
                holder.editProductInfo.setVisibility(View.INVISIBLE);
                holder.editProduct.setTextSize(1);
                holder.editProductInfo.setTextSize(1);
            }else {
                holder.editProduct.setVisibility(View.VISIBLE);
                holder.editProductInfo.setVisibility(View.VISIBLE);
                holder.editProduct.setTextSize(18);
                holder.editProductInfo.setTextSize(18);
            }
        });

    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}

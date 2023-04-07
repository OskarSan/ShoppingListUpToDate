package com.example.shoppinglist;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder {
    TextView productText, productInfoText;
    ImageButton productEditButton, productDeleteButton;


    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        productText = itemView.findViewById(R.id.productTextView);
        productInfoText = itemView.findViewById(R.id.productInfoTextView);
        productEditButton = itemView.findViewById(R.id.productEditButton);
        productDeleteButton = itemView.findViewById(R.id.productDeleteButton);
    }
}

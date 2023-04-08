package com.example.shoppinglist;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder {
    TextView productText, productInfoText;
    ImageView removeImage, editImage;
    ImageButton productEditButton, productDeleteButton;
    EditText editProduct, editProductInfo;


    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        productText = itemView.findViewById(R.id.productTextView);
        productInfoText = itemView.findViewById(R.id.productInfoTextView);
        removeImage = itemView.findViewById(R.id.imgRemove);
        editImage = itemView.findViewById(R.id.imgEdit);
        editProduct = itemView.findViewById(R.id.editProductNameEditText);
        editProductInfo = itemView.findViewById(R.id.editProductInfoEditText);
    }
}

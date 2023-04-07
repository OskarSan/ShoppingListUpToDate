package com.example.shoppinglist;

import java.util.ArrayList;

public class ProductStorage {
    private static ProductStorage productStorage = null;
    ArrayList<Product> productList = new ArrayList<>();



    public static ProductStorage getInstance(){
        if(productStorage == null){
            productStorage = new ProductStorage();
        }
        return productStorage;
    }

    public void addProduct(Product product){
        productList.add(product);
    }


    public ArrayList<Product> getProducts() {
        return productList;
    }

}

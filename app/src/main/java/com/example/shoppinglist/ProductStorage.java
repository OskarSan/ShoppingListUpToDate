package com.example.shoppinglist;

import android.view.View;

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

    public void removeProduct(String id){
        int i = 0;
        for(Product r : productList ){
            if(r.getId().equals(id)){
                break;
            }
            i++;
        }
        productList.remove(i);
    }
    public ArrayList<Product> getProducts() {
        return productList;
    }


    public Product getProductById(int id) {
        return productList.get(id);
    }


    public void sortAlphabetically(View view){
        productList.sort(Product.productNameComparator);
    }
    public void sortByTime(View view){
        productList.sort(Product.productIdComparator);
    }
}

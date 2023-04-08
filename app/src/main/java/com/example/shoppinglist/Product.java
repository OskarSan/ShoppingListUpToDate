package com.example.shoppinglist;

import java.io.Serializable;
import java.util.Comparator;

public class Product implements Serializable {
    protected String name, info, id;
    int i;


    public Product (String name, String info, String id){
        this.name = name;
        this.info = info;
        this.id = id;
    }




    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static Comparator<Product> productNameComparator = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    };
    public static Comparator<Product> productIdComparator = new Comparator<Product>() {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getId().compareTo(p2.getId());
        }
    };
}

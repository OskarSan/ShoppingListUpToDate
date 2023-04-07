package com.example.shoppinglist;

import java.io.Serializable;
import java.util.Comparator;

public class Product implements Serializable {
    protected String name;
    protected String info;

    public Product (String name, String info){
        this.name = name;
        this.info = info;

    }




    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}

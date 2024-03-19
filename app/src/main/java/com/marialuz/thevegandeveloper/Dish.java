package com.marialuz.thevegandeveloper;

import androidx.annotation.NonNull;

public class Dish {

    private String title;
    private String description;
    private int price;

    public Dish(String title, String description, int price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return this.title + "\n" + this.description + "\n" + this.price;
    }
}

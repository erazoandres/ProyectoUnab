package com.example.myapplication.entities;

public class producto {
    String name;
    String Description;
    int price;
    int image;

    public producto(String name, String description, int price, int image) {
        this.name = name;
        Description = description;
        this.price = price;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public int getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}

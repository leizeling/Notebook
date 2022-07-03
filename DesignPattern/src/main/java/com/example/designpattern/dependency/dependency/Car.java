package com.example.designpattern.dependency.dependency;

public class Car {
    private static final String TAG = "Car";

    private String brand = "Audi";

    public static String getTag() {
        return TAG;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

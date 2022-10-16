package com.example.app;

public class Tiramisu implements Confectionery {
    @Override
    public String getDescription() {
        return "Tiramisu ";
    }

    @Override
    public int price() {
        return 400;
    }

    @Override
    public int amount() {

        return 1;
    }
}

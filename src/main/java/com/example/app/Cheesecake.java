package com.example.app;

public class Cheesecake implements Confectionery {
    @Override
    public String getDescription() {
        return "Cheesecake ";
    }

    @Override
    public int price() {
        return 480;
    }

    @Override
    public int amount() {
        return 1;
    }
}

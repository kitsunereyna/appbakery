package com.example.app;

public class NapoleonCake implements Confectionery {
    @Override
    public String getDescription() {
        return "Napoleon cake ";
    }

    @Override
    public int price() {
        return 500;
    }

    @Override
    public int amount() {
        return 1;
    }

}

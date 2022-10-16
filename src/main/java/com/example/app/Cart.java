package com.example.app;

import java.util.ArrayList;
import java.util.Objects;

import static com.example.app.OrderItems.items;

public class Cart {


    private static Cart cart;
    private static String check = "";

    public static synchronized Cart getCart(){
        if(cart == null){
            cart = new Cart();
        }
        return cart;
    }

    private Cart(){

    }

    public void addCheckInfo(String checkInfo){
        check += checkInfo + "\n";
    }

    public String showCheckInfo(){
        return check;
    }
}

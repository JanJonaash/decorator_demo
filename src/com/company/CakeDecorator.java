package com.company;

public class CakeDecorator implements Cake{

    private Cake cake;


    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void add() {
        cake.add();
    }
}

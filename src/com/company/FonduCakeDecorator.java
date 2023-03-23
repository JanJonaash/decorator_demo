package com.company;

public class FonduCakeDecorator extends CakeDecorator{
    public FonduCakeDecorator(Cake cake) {
        super(cake);
    }


    @Override
    public void add() {
        super.add();
        addFondu();

    }


    void addFondu(){

        System.out.println("has fondu");
    }
}

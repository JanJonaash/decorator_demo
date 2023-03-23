package com.company;

public class CorpusCakeDecorator extends CakeDecorator{
    public CorpusCakeDecorator(Cake cake) {
        super(cake);
    }


    @Override
    public void add() {
        super.add();
        addCorpus();
    }

    void addCorpus(){

        System.out.println("has corpus");
    }
}

package com.company;

import Verification.CapitalVerifier;
import Verification.LowerVerifier;
import Verification.NumberVerifier;
import Verification.WordContainer;

public class Main {

    public static void main(String[] args) {


        BasicCake cake = new BasicCake();

        CorpusCakeDecorator corp = new CorpusCakeDecorator(cake);
        corp.add();
        FonduCakeDecorator fond = new FonduCakeDecorator(corp);
        fond.add();


        WordContainer txt = new WordContainer("AZaz9");


        var cv = new CapitalVerifier(txt);
        System.out.println(cv.getWord());
        System.out.println(cv.verify());



        var lv = new LowerVerifier(cv);
        System.out.println(lv.verify());


        var nv = new NumberVerifier(cv);
        System.out.println(nv.verify());



    }
}

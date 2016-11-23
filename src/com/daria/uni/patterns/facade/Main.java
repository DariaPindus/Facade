package com.daria.uni.patterns.facade;


import com.daria.uni.patterns.facade.classes.Designer;
import com.daria.uni.patterns.facade.classes.Factory;
import com.daria.uni.patterns.facade.classes.Tailor;

public class Main {
    public static void main(String[] args) {
        Designer designer = new Designer();
        Factory factory = new Factory();
        Tailor tailor = new Tailor();

        DressCreationFacade facade = new DressCreationFacade(designer, tailor, factory);
        System.out.println("Start dress creation");
        facade.createDress();
        System.out.println("End it");
    }
}

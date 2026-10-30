package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Dev {

    @Autowired
    @Qualifier("laptop") // give a component which one we wan't to choose

//    private Laptop laptop;
    private Computer comp;

//    private Dev(Laptop laptop){
//        this laptop = laptop;
//    }

    public void build(){
//        laptop.compile();
        comp.compile();
        System.out.println("working on Awesome Project");
    }

}

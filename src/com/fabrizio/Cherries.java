package com.fabrizio;

public class Cherries implements Fruit{

    @Override
    public void grow() {
        System.out.println("cherries grow 10 cm");
    }

    @Override
    public void harvest() {
        System.out.println("harvested 15 cherries");
    }
}

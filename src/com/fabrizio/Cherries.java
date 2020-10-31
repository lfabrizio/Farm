package com.fabrizio;

public class Cherries implements Fruit{

    @Override
    public void grow() {
        System.out.println("Cherries grow 10 cm");
    }

    @Override
    public void harvest() {
        System.out.println("Harvested 15 Cherries");
    }
}

package com.fabrizio;

public class Main {
        // example using a farm to implement interfaces
    public static void main(String[] args) {
	// write your code here
        Orange orange = new Orange();
        orange.grow();

        Cherries c = new Cherries();
        c.grow();
        c.harvest();
    }
}

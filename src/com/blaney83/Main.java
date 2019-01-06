package com.blaney83;

public class Main {

    public static void main(String[] args) {

        Burger myBurger = new Burger();
        System.out.println("*************************");
        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println("*************************");
        DeluxCombo deluxCombo = new DeluxCombo();
        System.out.println("*************************");
        myBurger.toggleLettuce(true);
        System.out.println("*************************");
        healthyBurger.toggleMayo(true);
        System.out.println("*************************");
        healthyBurger.toggleAvocado(true);
        System.out.println("*************************");
        deluxCombo.toggleChips(true);
        System.out.println("*************************");
        deluxCombo.toggleDrink(true);
        System.out.println("*************************");
        deluxCombo.toggleMayo(false);
        System.out.println("*************************");
        myBurger.showOrder();
        System.out.println("*************************");
        healthyBurger.showOrder();
        System.out.println("*************************");
        deluxCombo.showOrder();
        //super hamburger: bread roll, meat, 4 additions (lettuce) for a price(for base price + additions)
        //constructor should inlude roll type, meat, and price
        //methods for adding additional items
        //sub class 2x: Healthy burger, only on whole wheat, plus 2 add. items (6 total, 4 from base and 2 specific)
        //              Delux burger, comes with chips and drinks, but no extra additions
        //all hamburgers should have a method that can be called anywhere for base price of specific hamburger PLUS add.
        //while also showing addition names and prices, plus a grand total for the burger
        //(for 2x subs, this might be taking the base price from Super and adding additional pricing as well
    }
}

package com.blaney83;

public class Burger{

    private String bread;
    private String meat;
    private Boolean lettuce;
    private String burgerType;
    private Boolean tomato;
    private Boolean onion;
    private Boolean mayo;
    private double price;
    private final double basePrice = 5.00;

    public Burger(){
        this("beef", "white");
    }

    public Burger (String meat, String bread){
        this.bread = bread;
        this.meat = meat;
        this.price = basePrice;
        if(meat != "beef"){
            this.price += 1.00;
        }
        this.burgerType = "original";
        lettuce = false;
        tomato = false;
        onion = false;
        mayo = false;
//        System.out.println("Your burger order has started. Your + " + this.burgerType + " burger currently has " + meat + " on a " + this.bread + " bun for $" + String.format("%.2f", this.price) + ". You can add more if you would like." );
        System.out.println("Order started!");
    }

    public void toggleLettuce(boolean included){
        if(included && this.lettuce){
//            System.out.println("Lettuce is already on your burger");
        }else if(!included && this.lettuce){
            this.price -= .50;
            this.lettuce = false;
            System.out.println("Lettuce removed from your order");
        }else if(included && !this.lettuce){
            this.price += .50;
            this.lettuce = true;
            System.out.println("Lettuce added to your order.");
        }else{
//            System.out.println("There is no lettuce to remove from your order");
        }
//        System.out.println(lettuce);
    }

    public void toggleTomato(boolean included){
        if(included && this.tomato){
//            System.out.println("Tomato is already on your burger");
        }else if(!included && this.tomato){
            this.price -= .50;
            this.tomato = false;
            System.out.println("Tomato removed from your order");
        }else if(included && !this.tomato){
            this.price += .50;
            this.tomato = true;
            System.out.println("Tomato added to your order.");
        }else{
//            System.out.println("There is no Tomato to remove from your order");
        }
//        System.out.println(tomato);
    }

    public void toggleOnion(boolean included){
        if(included && this.onion){
//            System.out.println("Onion is already on your burger");
        }else if(!included && this.onion){
            this.price -= .50;
            this.onion = false;
            System.out.println("Onion removed from your order");
        }else if(included && !this.onion){
            this.price += .50;
            this.onion = true;
            System.out.println("Onion added to your order.");
        }else{
//            System.out.println("There is no onion to remove from your order");
        }
//        System.out.println(onion);
    }

    public void toggleMayo(boolean included){
        if(included && this.mayo){
//            System.out.println("Mayo is already on your burger");
        }else if(!included && this.mayo){
            this.price -= .50;
            this.mayo = false;
            System.out.println("Mayo removed from your order");
        }else if(included && !this.mayo){
            this.price += .50;
            this.mayo = true;
            System.out.println("Mayo added to your order.");
        }else{
//            System.out.println("There is no mayo to remove from your order");
        }
        System.out.println(mayo);
    }

    public void showOrder(){
        String breadStatus = this.bread == "wheat" ? "wheat" : "white";
        String lettuceStatus = this.lettuce ? "lettuce" : "no lettuce";
        String tomatoStatus = this.tomato ? "tomato" : "no tomato";
        String onionStatus = this.onion ? "onion" : "no onion";
        String mayoStatus = this.mayo ? "mayo" : "no mayo";
        System.out.println("Your order summary: " + "\n" + breadStatus + "\n" + lettuceStatus + "\n" + tomatoStatus + "\n" + onionStatus + "\n" + mayoStatus + "\n" + "Price = $" + String.format("%.2f", this.basePrice) + " + $" + String.format("%.2f", (this.price - this.basePrice)) + " in additions" + "\n" + "Total: $" + String.format("%.2f", this.price));
    }

    public double getPrice() {
        return price;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Boolean getLettuce() {
        return lettuce;
    }

    public Boolean getTomato() {
        return tomato;
    }

    public Boolean getOnion() {
        return onion;
    }

    public Boolean getMayo() {
        return mayo;
    }
}

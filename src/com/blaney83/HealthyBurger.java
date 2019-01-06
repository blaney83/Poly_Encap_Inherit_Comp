package com.blaney83;

public class HealthyBurger extends Burger {
    private boolean avocado;
    private boolean egg;
    private double healthyPrice;

    public HealthyBurger() {
        super("turkey", "wheat");
        toggleLettuce(true);
        toggleMayo(false);
        toggleOnion(true);
        toggleTomato(true);
        this.healthyPrice = getPrice();
        System.out.println("You may add avocado or egg to your burger!");
    }

    public void toggleAvocado(boolean included){
        if(included && this.avocado){
            System.out.println("Avocado is already on your burger");
        }else if(!included && this.avocado){
            this.healthyPrice -= .50;
            this.avocado = false;
            System.out.println("Avocado removed from your order");
        }else if(included && !this.avocado){
            this.healthyPrice += .50;
            this.avocado = true;
            System.out.println("Avocado added to your order.");
        }else{
            System.out.println("There is no avocado to remove from your order");
        }
    }

    public void toggleEgg(boolean included){
        if(included && this.egg){
            System.out.println("Egg is already on your burger");
        }else if(!included && this.egg){
            this.healthyPrice -= .50;
            this.egg = false;
            System.out.println("Egg removed from your order");
        }else if(included && !this.egg){
            this.healthyPrice += .50;
            this.egg = true;
            System.out.println("Egg added to your order.");
        }else{
            System.out.println("There is no egg to remove from your order");
        }
    }

    @Override
    public void showOrder() {
        String lettuceStatus = getLettuce() ? "lettuce" : "no lettuce";
        String tomatoStatus = getTomato() ? "tomato" : "no tomato";
        String onionStatus = getOnion() ? "onion" : "no onion";
        String mayoStatus = getMayo() ? "mayo" : "no mayo";
        String avocadoStatus = this.avocado ? "avocado" : "no avocado";
        String eggStatus = this.egg ? "egg" : "no egg";
        System.out.println("Your order summary: \nwheat\n" + lettuceStatus + "\n" + tomatoStatus + "\n" + onionStatus + "\n" + mayoStatus + "\n" + avocadoStatus + "\n" + eggStatus + "\nPrice = $" + String.format("%.2f", getBasePrice()) + " + $" + String.format("%.2f", (healthyPrice - getBasePrice())) + " in additions" + "\n" + "Total: $" + String.format("%.2f", healthyPrice));
    }
}

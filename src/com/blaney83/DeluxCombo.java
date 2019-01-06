package com.blaney83;

public class DeluxCombo extends Burger {

    private boolean drink;
    private boolean chips;
    private double deluxPrice;


    public DeluxCombo(){
        super();
        super.toggleLettuce(true);
        super.toggleTomato(true);
        super.toggleOnion(true);
        super.toggleMayo(true);
        this.deluxPrice = getPrice();
    }

    public void toggleChips(boolean included){
        if(included && this.chips){
            System.out.println("Chips is already on your burger");
        }else if(!included && this.chips){
            this.deluxPrice -= .75;
            this.chips = false;
            System.out.println("Chips removed from your order");
        }else if(included && !this.chips){
            this.deluxPrice += .75;
            this.chips = true;
            System.out.println("Chips added to your order.");
        }else{
            System.out.println("There is no chips to remove from your order");
        }
    }

    public void toggleDrink(boolean included){
        if(included && this.drink){
            System.out.println("Drink is already on your burger");
        }else if(!included && this.drink){
            this.deluxPrice -= .75;
            this.drink = false;
            System.out.println("Drink removed from your order");
        }else if(included && !this.drink){
            this.deluxPrice += .75;
            this.drink = true;
            System.out.println("Drink added to your order.");
        }else{
            System.out.println("There is no drink to remove from your order");
        }
    }

    @Override
    public void toggleLettuce(boolean included) {
        System.out.println("Sorry, you can't modify the delux burger. You can add chips or a drink!");
    }

    @Override
    public void toggleTomato(boolean included) {
        System.out.println("Sorry, you can't modify the delux burger. You can add chips or a drink!");
    }

    @Override
    public void toggleOnion(boolean included) {
        System.out.println("Sorry, you can't modify the delux burger. You can add chips or a drink!");
    }

    @Override
    public void toggleMayo(boolean included) {
        System.out.println("Sorry, you can't modify the delux burger. You can add chips or a drink!");
    }

    @Override
    public void showOrder() {
        String chipsStatus = this.chips ? "chips" : "no chips";
        String drinkStatus = this.drink ? "drink" : "no drink";
        System.out.println("Your order summary: \nwheat\nlettuce\ntomato\nonion\nmayo" + chipsStatus + "\n" + drinkStatus + "\nPrice = $" + String.format("%.2f", getBasePrice()) + " + $" + String.format("%.2f", (deluxPrice - getBasePrice())) + " in additions" + "\n" + "Total: $" + String.format("%.2f", deluxPrice));
    }
}

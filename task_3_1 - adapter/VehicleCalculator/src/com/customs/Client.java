package com.customs;

public class Client {
    public static void main(String[] args){
        Auto auto_1 = new Auto(12, "Audi", true, 1200);
        Customs ukrCalculator = new UkrainianCosts();
        float price_1 = ukrCalculator.vehiclePrice(auto_1);
        System.out.println("Price of " + auto_1 + ": "+price_1 + " UAH");
        float tax = ukrCalculator.tax(auto_1);
        System.out.println("Tax: " + tax + " UAH");

        float full_cost = tax + price_1;
        System.out.println("Вартість після розмитнення: " + full_cost + " UAH");

    }
}

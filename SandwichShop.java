package org.launchcode;

import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today? ");
        int veggiesSold = keyboard.nextInt();
        if (veggiesSold >= goalForVeggies) {
            out.println("\nMade goal for veggies.");
        } else {
            out.println("\nFell short for veggies.");
        }
        out.println("The sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today? ");
        int burgersSold = keyboard.nextInt();
        if (burgersSold >= goalForBurgers) {
            out.println("\nMade goal for burgers.");
        } else {
            out.println("\nFell short for burgers.");
        }
        out.println("The sales goal for subs is " + goalForSubs);
        out.println("How many subs were sold today? ");
        int subsSold = keyboard.nextInt();
        if (subsSold >= goalForSubs) {
            out.println("\nMade goal for subs.");
        } else {
            out.println("\nFell short for subs.");
        }
        out.println("The sales goal for soup is " + goalForSoup);
        out.println("How many soups were sold today? ");
        int soupSold = keyboard.nextInt();
        if (soupSold >= goalForSoup) {
            out.println("\nMade goal for soup.");
        } else {
            out.println("\nFell short for soup.");
        }
        if (veggiesSold >= goalForVeggies && burgersSold >= goalForBurgers &&
                subsSold >= goalForSubs && soupSold >= goalForSoup) {
            out.println("\nMade goal for everything!");
        }
    }
}

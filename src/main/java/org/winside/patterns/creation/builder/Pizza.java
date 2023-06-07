package org.winside.patterns.creation.builder;

import java.util.List;

public class Pizza {
    private Dough dough;
    private Sauce sauce;
    private List<Topping> toppings;
    private boolean hasCheese;
    private boolean isVegetarian;
    private boolean isSpicy;
    private int sizeInInches;

    private Pizza() {
    }

    public Pizza(Dough dough,
                 Sauce sauce,
                 List<Topping> toppings,
                 boolean hasCheese,
                 boolean isVegetarian,
                 boolean isSpicy,
                 int sizeInInches) {
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
        this.hasCheese = hasCheese;
        this.isVegetarian = isVegetarian;
        this.isSpicy = isSpicy;
        this.sizeInInches = sizeInInches;
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public boolean isHasCheese() {
        return hasCheese;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public int getSizeInInches() {
        return sizeInInches;
    }

}

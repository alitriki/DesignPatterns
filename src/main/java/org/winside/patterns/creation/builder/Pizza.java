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

    private Pizza(Dough dough,
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

    public static final class PizzaBuilder {
        private Dough dough;
        private Sauce sauce;
        private List<Topping> toppings;
        private boolean hasCheese;
        private boolean isVegetarian;
        private boolean isSpicy;
        private int sizeInInches;

        private PizzaBuilder() {
        }

        public static PizzaBuilder builder() {
            return new PizzaBuilder();
        }

        public PizzaBuilder withDough(Dough dough) {
            this.dough = dough;
            return this;
        }

        public PizzaBuilder withSauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder withToppings(List<Topping> toppings) {
            this.toppings = toppings;
            return this;
        }

        public PizzaBuilder withCheese(boolean hasCheese) {
            this.hasCheese = hasCheese;
            return this;
        }

        public PizzaBuilder isVegetarian(boolean isVegetarian) {
            this.isVegetarian = isVegetarian;
            return this;
        }

        public PizzaBuilder isSpicy(boolean isSpicy) {
            this.isSpicy = isSpicy;
            return this;
        }

        public PizzaBuilder withSizeInInches(int sizeInInches) {
            this.sizeInInches = sizeInInches;
            return this;
        }

        public Pizza build() {
            return new Pizza(dough, sauce, toppings, hasCheese, isVegetarian, isSpicy, sizeInInches);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", sauce=" + sauce +
                ", toppings=" + toppings +
                ", hasCheese=" + hasCheese +
                ", isVegetarian=" + isVegetarian +
                ", isSpicy=" + isSpicy +
                ", sizeInInches=" + sizeInInches +
                '}';
    }
}

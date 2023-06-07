package org.winside.patterns.creation.builder;

import java.util.List;

public class PizzaMain {
    public static void main(String[] args) {

        // Build a pizza with different configurations
        Pizza pizza1 = Pizza.PizzaBuilder.builder()
                .withDough(Dough.THIN_CRUST)
                .withSauce(Sauce.TOMATO)
                .withToppings(List.of(Topping.MUSHROOMS, Topping.EXTRA_CHEESE))
                .withCheese(true)
                .isVegetarian(true)
                .withSizeInInches(12)
                .build();

        // Build another pizza with different configurations
        Pizza pizza2 = Pizza.PizzaBuilder.builder()
                .withDough(Dough.THICK_CRUST)
                .withSauce(Sauce.BARBECUE)
                .withToppings(List.of(Topping.ANCHOVIES, Topping.BELL_PEPPERS))
                .withCheese(true)
                .isVegetarian(false)
                .withSizeInInches(16)
                .build();

        // Print the details of the pizzas
        System.out.println("Pizza 1:");
        System.out.println(pizza1);

        System.out.println("\nPizza 2:");
        System.out.println(pizza2);
    }
}

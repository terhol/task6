package se.terhol.task6.core;

import java.util.Set;
import java.util.HashSet;

public class Demo1 {
    /*public static void main(String[] args) {
        ShoppingList list = createList();

        System.out.println();
        System.out.println("==================================================");
        System.out.println();

        System.out.println("PRODUCTS:");
        for (Product product : list.getProducts()) {
            System.out.println("  * " + product.getName() + ": " + product.getPrice() + " Kc");
        }

        System.out.println("----------------------------------------");
        System.out.println("PRODUCTS BY PRICE:");
        for (Product product : list.getProductsByPrice()) {
            System.out.println("  * " + product.getName() + ": " + product.getPrice() + " Kc");
        }
    }

    private static ShoppingList createList() {
        Product[] products = new Product[]{
                new Product("Auto", 1000),
                new Product("Plysova zirafa", 100),
                new Product("Houby", 100),
                new Product("Zapalky", 2),
                new Product("Mleko", 20)
        };

        Set<Product> productSet = new HashSet<Product>();
        for (Product product : products) {
            productSet.add(product);
        }

        return new ShoppingListImpl(productSet);
    }*/
}

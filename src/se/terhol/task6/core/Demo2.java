package se.terhol.task6.core;

import java.util.Set;
import java.util.HashSet;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class Demo2 {
    /*public static void main(String[] args) throws IOException {
        ShoppingListIO list = createList();

        System.out.println();
        System.out.println("==================================================");
        System.out.println();

        System.out.println("---- Test ukladani dat");
        try {
            list.save(new FileOutputStream("output-data.txt"));
            System.out.println(" [OK] podivejte se do souboru 'src/se/terhol/task6/resources/output-data.txt'");
        } catch (ShoppingListException ex) {
            System.out.println(" [ERROR] byla vyhozena vyjimka: " + ex);
        }
        System.out.println();

        list = new ShoppingListImpl(new HashSet<Product>());
        System.out.println("---- Test nacteni bezchybnych dat z 'input-data-ok.txt'");
        try {
            list.load(new FileInputStream("src/se/terhol/task6/resourcesinput-data-ok.txt"));
            System.out.println(" [OK] nasledujici vypis by se mel (az na poradi radku) shodovat se souborem 'input-data-ok.txt':");
            System.out.println();
            list.save(System.out);
        } catch (ShoppingListException ex) {
            System.out.println(" [ERROR] byla vyhozena vyjimka: " + ex);
        }
        System.out.println();

        list = new ShoppingListImpl(new HashSet<Product>());
        System.out.println("---- Test nacteni chybnych dat z 'input-data-error-1.txt'");
        try {
            list.load(new FileInputStream("src/se/terhol/task6/resourcesinput-data-error-1.txt"));
            System.out.println(" [ERROR] nebyla vyhozena vyjimka");
        } catch (ShoppingListException ex) {
            System.out.println(" [OK]");
        } catch (Exception ex) {
            System.out.println(" [ERROR] byla vyhozena spatna vyjimka: " + ex);
        }
        System.out.println();

        list = new ShoppingListImpl(new HashSet<Product>());
        System.out.println("---- Test nacteni chybnych dat z 'input-data-error-2.txt'");
        try {
            list.load(new FileInputStream("src/se/terhol/task6/resourcesinput-data-error-2.txt"));
            System.out.println(" [ERROR] nebyla vyhozena vyjimka");
        } catch (ShoppingListException ex) {
            System.out.println(" [OK]");
        } catch (Exception ex) {
            System.out.println(" [ERROR] byla vyhozena spatna vyjimka: " + ex);
        }
    }

    private static ShoppingListIO createList() {
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

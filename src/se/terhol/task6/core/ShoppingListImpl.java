package se.terhol.task6.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Tereza Holm
 */
public class ShoppingListImpl implements ShoppingList, ShoppingListIO {
    private SortedSet<Product> products = new TreeSet<>();

    /**
     * @param products
     * @throws NullPointerException if the parameter products is null
     */
    public ShoppingListImpl(Set<Product> products) {
        if (products == null) {
            throw new NullPointerException("Products cannot be null.");
        }
        this.products.addAll(products);
    }

    @Override
    public Collection<Product> getProducts() {
        return Collections.unmodifiableSortedSet(products);
    }

    @Override
    public Collection<Product> getProductsByPrice() {
        SortedSet<Product> productsSortedByPrice = new TreeSet<>(new ProductPriceComparator());
        productsSortedByPrice.addAll(products);
        return Collections.unmodifiableSortedSet(productsSortedByPrice);
    }

    @Override
    public void load(InputStream input) throws ShoppingListException {
        try {
            String productName;
            int productPrice;
            BufferedReader in = new BufferedReader(new InputStreamReader(input));
            String line = in.readLine();

            if (line.length() == 0) {
                throw new ShoppingListException();
            }

            while (line != null && line.length() != 0) {
                int i = line.indexOf(" ");
                productName = line.substring(i + 1);
                productPrice = Integer.parseInt(line.substring(0, i));

                this.products.add(new Product(productName, productPrice));

                line = in.readLine();
            }
        } catch (Exception e) {
            throw new ShoppingListException();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Unknown error in reading file.");
            }
        }
    }

    @Override
    public void save(OutputStream output) throws ShoppingListException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
        try {
            for (Product product : getProducts()) {
                writer.write(product.getPrice() + " " + product.getName());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new ShoppingListException();
        } finally {
            try {
                writer.flush();
            } catch (IOException e) {
                System.out.println("Unknown error in writing file.");
            }
        }
    }
}
package se.terhol.task6.core;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Tereza Holm
 */
public class ShoppingListImpl implements ShoppingList {
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
}

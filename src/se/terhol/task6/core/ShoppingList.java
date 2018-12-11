package se.terhol.task6.core;

import java.util.Collection;

/**
 * List of products of the shop.
 *
 * @author Jan Papousek
 */
public interface ShoppingList {
    /**
     * @return Products sorted by their name
     */
    Collection<Product> getProducts();

    /**
     * @return Products sorted by their price
     */
    Collection<Product> getProductsByPrice();
}

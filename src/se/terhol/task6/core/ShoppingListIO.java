package se.terhol.task6.core;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * This interface extends shoping list with methods allowing
 * to store and recover shoping list content (products) by
 * writing/reading data to/from IO streams.
 *
 * @author Jan Papousek
 */
public interface ShoppingListIO extends ShoppingList {
    /**
     * Reads input stream and sets shoping list content (products).
     * Old shoping list content (if any) is overwritten.
     * This method should fail atomically, i.e. if reading fails for some
     * reason, then old scoreboard content is preserved!
     * <p>
     * Format of input data is as follows:
     * a) single line contains information about just one product
     * b) line contains price and name of the product separated by single white space
     * c) name of the product can consist of more white-space-separated text strings
     * <p>
     * Example:
     * 10 Milk
     * 25 Cheese cake
     * 160 Potatoes
     *
     * @param input Input stream -- source of data.
     * @throws ShoppingListException on IO failure or if data in input stream
     *                              has invalid format.
     */
    void load(InputStream input) throws ShoppingListException;

    /**
     * Writes shoping list content (products) into given output stream.
     * Output format -- see load() method.
     *
     * @param output Output stream.
     * @throws ShoppingListException on failure during the writing data into
     *                              output stream.
     */
    void save(OutputStream output) throws ShoppingListException;
}

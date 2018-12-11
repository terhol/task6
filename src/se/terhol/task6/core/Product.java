package se.terhol.task6.core;

/**
 * Product in shop.
 *
 * @author Jan Papousek
 */
public class Product implements Comparable<Product> {
    private String name;
    private int price;
    private int quantity;

    /**
     * It creates a new product with specific name and price.
     *
     * @param name  The name of the product.
     * @param price The price of the product.
     * @throws NullPointerException     if the name is null.
     * @throws IllegalArgumentException if the price isn't a positive number.
     */
    public Product(String name, int price) {
        if (name == null) {
            throw new NullPointerException("The parameter [name] is null.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("The parameter [price] has to be a positive number.");
        }
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    /**
     * @return The name of the product
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return this.name.equals(product.getName());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * 31;
    }

    /**
     * @return The price of the product
     */
    public int getPrice() {
        return price;
    }

    /**
     * @return The quantity of the product
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * It sets a quantity of the product (number of pieces which the customer wants to buy).
     *
     * @param quantity A new quantity
     * @throws IllegalArgumentException if the quantity isn't a positive number
     */
    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("The parameter [quantity] has to be a positive number.");
        }
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Product product) {
        return this.name.compareTo(product.getName());
    }
}

package se.terhol.task6.core;

import java.util.Comparator;

/**
 * @author Tereza Holm
 */
public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1 == null && o2 == null) {
            return 0;
        }
        if (o1 == null) {
            return 1;
        }
        if (o2 == null) {
            return -1;
        }
        if (o1.getPrice() == o2.getPrice()) {
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getPrice() - o2.getPrice();
    }
}

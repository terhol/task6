package se.terhol.task6.core;

public class ShoppingListException extends Exception {
    public ShoppingListException() {
    }

    public ShoppingListException(String msg) {
        super(msg);
    }

    public ShoppingListException(Throwable cause) {
        super(cause);
    }

    public ShoppingListException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

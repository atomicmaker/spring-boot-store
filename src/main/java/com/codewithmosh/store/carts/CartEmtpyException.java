package com.codewithmosh.store.carts;

public class CartEmtpyException extends RuntimeException {
    public CartEmtpyException() {
        super("Cart is empty");
    }
}

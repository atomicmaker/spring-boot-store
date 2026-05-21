package com.codewithmosh.store.exceptions;

public class CartEmtpyException extends RuntimeException {
    public CartEmtpyException() {
        super("Cart is empty");
    }
}

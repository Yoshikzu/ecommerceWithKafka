package br.com.yoshikazu.ecommerce;

import java.math.BigDecimal;

class Order {
    private final String userId, orderId;
    private final BigDecimal amount;

    public Order(String userId, String orderId, BigDecimal amount) {
        this.userId = userId;
        this.orderId = orderId;
        this.amount = amount;
    }
}

package org.example;

public class Order {
    private String orderSummary;
    private boolean paymentStatus;
    private String shippingDetails;
    private Cart cart;
    private User user;

    public Order(User user, Cart cart) {
        this.user = user;
        this.cart = cart;
        this.paymentStatus = false;
        generateOrderSummary();
    }

    private void generateOrderSummary() {
        orderSummary = "Order Summary for " + user.getName() + ":\n" + cart.viewCart();
    }

    public boolean processPayment() {
        paymentStatus = true;
        return paymentStatus;
    }

    public void setShippingDetails(String shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public String getShippingDetails() {
        return shippingDetails;
    }

    public String confirmOrder() {
        if (processPayment()) {
            return "Order confirmed! " + orderSummary + "Shipping to: " + shippingDetails;
        } else {
            return "Payment failed. Please try again.";
        }
    }
}

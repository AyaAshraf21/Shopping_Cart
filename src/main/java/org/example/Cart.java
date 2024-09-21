package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().equals(product)) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void removeItem(Product product) {
        items.removeIf(item -> item.getProduct().equals(product));
    }

    public void updateQuantity(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().equals(product)) {
                item.setQuantity(quantity);
                return;
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public String viewCart() {
        StringBuilder cartSummary = new StringBuilder();
        for (CartItem item : items) {
            cartSummary.append(item.toString()).append("\n");
        }
        cartSummary.append("Total: $").append(calculateTotal()).append("\n");
        return cartSummary.toString();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}

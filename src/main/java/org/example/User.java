package org.example;

public class User {
    private String name;
    private String email;
    private Cart cart;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.cart = new Cart();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cart getCart() {
        return cart;
    }

    // Checkout method to generate an order
    public Order checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty. Add items to proceed with checkout.");
            return null;
        }
        Order order = new Order(this, cart);
        System.out.println(order.confirmOrder());
        return order;
    }
}


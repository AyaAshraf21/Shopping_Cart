package org.example;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", "Dell XPS 13", 1200.00, 10);
        Product phone = new Product("Smartphone", "iPhone 13", 999.99, 5);
        Product headphones = new Product("Headphones", "Sony WH-1000XM4", 349.99, 20);

        User user = new User("John Doe", "john@example.com");

        user.getCart().addItem(laptop, 1);
        user.getCart().addItem(phone, 2);
        user.getCart().addItem(headphones, 3);

        System.out.println("Viewing Cart:");
        System.out.println(user.getCart().viewCart());

        user.checkout().setShippingDetails("123 Main St, Springfield");

        user.checkout();
    }
}

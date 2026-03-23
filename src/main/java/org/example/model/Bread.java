package org.example.model;

public class Bread extends ProductForSale {

    private double weight;

    public Bread(String type, double price, String description, double weight) {
        super(type, price, description);
        this.weight = weight;
    }

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.weight = 0;
    }

    public double getWeight() { return weight; }

    @Override
    public void showDetails() {
        System.out.println("Bread -> type: " + getType() +
                ", price: " + getPrice() +
                ", description: " + getDescription() +
                ", weight: " + weight + "g");
    }
}
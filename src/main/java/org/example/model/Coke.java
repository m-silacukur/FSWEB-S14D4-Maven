package org.example.model;

public class Coke extends ProductForSale {

    private int volume;

    public Coke(String type, double price, String description, int volume) {
        super(type, price, description);
        this.volume = volume;
    }
    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volume = 0;
    }

    public int getVolume() { return volume; }

    @Override
    public void showDetails() {
        System.out.println("Coke -> type: " + getType() +
                ", price: " + getPrice() +
                ", description: " + getDescription() +
                ", volume: " + volume + "ml");
    }
}
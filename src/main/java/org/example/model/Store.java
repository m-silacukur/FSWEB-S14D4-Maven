package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Dark Chocolate", 12.5, "70% kakao", "Lindt");
        products[1] = new Coke("Soft Drink", 7.0, "Soğuk içecek", 330);
        products[2] = new Bread("Sourdough", 5.5, "Ekşi maya ekmeği", 500);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}
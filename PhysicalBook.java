/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personalassignment_d210231c;

public class PhysicalBook extends Book {
    private double weight;

    public PhysicalBook(String title, String author, double price, int quantity, double weight) {
        super(title, author, price, quantity);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateShippingCost() {
        double shippingCost = 4.50;
        if (weight > 500) {
            shippingCost += (weight - 500) / 250 * 1.00;
        }
        return shippingCost;
    }

    public double getWeightInPounds() {
        return weight / 453.59237;
    }
}

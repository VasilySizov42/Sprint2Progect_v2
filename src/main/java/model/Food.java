package model;

public abstract class Food  implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
    public abstract double getDiscount();
    // геттерыы для полей amount, price и isVegetarian
    public int getAmount() {
        return this.amount;
    }
    public double getPrice() {
        return this.price;
    }
    public boolean isVegetarian() {
        return this.isVegetarian;
    }
   }

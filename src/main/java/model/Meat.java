package model;

public class Meat extends Food{
    public Meat(int amount, double price) {
        super(amount, price, false);
    }
    @Override // метод реализует интерфейс Discountable
    public double getDiscount() {
        return 0;
    }
}


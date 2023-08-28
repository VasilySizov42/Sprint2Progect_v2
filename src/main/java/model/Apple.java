package model;

import static model.constants.Colour.RED;
import static model.constants.Discount.DISCOUNT_FOR_RED;

public class Apple extends Food{
    private String colour;
    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }
    @Override // метод реализует интерфейс Discountable
    public double getDiscount() {
        if (colour.equals(RED)) {
            return DISCOUNT_FOR_RED; // если яблоки красные, скидка 60%
        } else {
            return 0;
        }
    }
}

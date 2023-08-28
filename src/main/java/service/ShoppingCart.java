package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;
    public ShoppingCart(Food[] items) {
        this.items = items;
    }
    // возвращает общую сумму товаров в корзине без скидки
    public double getTotalWithoutDiscount() {
        double totalWithoutDiscount = 0;
        for (int i = 0; i < items.length; i++) {
                totalWithoutDiscount += items[i].getPrice()*items[i].getAmount();
            }
        return totalWithoutDiscount;
    }
    // возвращает общую сумму товаров в корзине со скидкой
    public double getTotalWithDiscount() {
        double totalWithDiscount = 0;
        for (int i = 0; i < items.length; i++) {
            totalWithDiscount += items[i].getPrice()*items[i].getAmount()*(1-items[i].getDiscount());
            }
        return totalWithDiscount;
    }
    // возвращает общую сумму всех вегетарианских продуктов в корзине без скидки
    public double getVegetarianTotalWithoutDiscount() {
        double vegetarianTotal = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()) {
                vegetarianTotal += items[i].getPrice()*items[i].getAmount();
            }
        }
        return vegetarianTotal;
    }
}

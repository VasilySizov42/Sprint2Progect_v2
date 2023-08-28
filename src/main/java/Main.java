import model.Food;
import model.Meat;
import model.Apple;
import service.ShoppingCart;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

class Main {
    public static void main(String[] args) {
        // Инициализация данных
        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, RED);
        Food greenApples = new Apple(8, 60, GREEN);

        ShoppingCart cart = new ShoppingCart(new Food[] { meat, redApples, greenApples });

        // Вычисление значений для корзины
        double totalWithoutDiscount = cart.getTotalWithoutDiscount(); // Общая сумма без скидки
        double totalWithDiscount = cart.getTotalWithDiscount(); // Общая сумма со скидкой
        double vegetarianTotalWithoutDiscount = cart.getVegetarianTotalWithoutDiscount(); // Сумма вегетарианских товаров без скидки

        System.out.println("Общая сумма товаров без скидки: " + totalWithoutDiscount);
        System.out.println("Общая сумма товаров со скидкой: " + totalWithDiscount);
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + vegetarianTotalWithoutDiscount);
    }
}
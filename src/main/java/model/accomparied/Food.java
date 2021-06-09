package model.accomparied;

import model.AccompaniedService;

public class Food extends AccompaniedService {
    public Food(String id, String name, int amount, double price) {
        super(id, name, amount, price);
    }

    @Override
    public String showInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
}

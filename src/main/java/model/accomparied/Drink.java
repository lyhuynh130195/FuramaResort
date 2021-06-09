package model.accomparied;

import model.AccompaniedService;

public class Drink extends AccompaniedService {

    public Drink(String id, String name, int amount, double price) {
        super(id, name, amount, price);
    }

    @Override
    public String showInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
}

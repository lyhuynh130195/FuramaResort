package model.accomparied;

import model.AccompaniedService;

public class RentCar extends AccompaniedService {

    public RentCar(String id, String name, int amount, double price) {
        super(id, name, amount, price);
    }

    @Override
    public String toString() {
        return "RentCar{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public String showInfo() {
        return toString();
    }
}

package model.accomparied;

import model.AccompaniedService;

public class Karaoke extends AccompaniedService {

    public Karaoke(String id, String name, int amount, double price) {
        super(id, name, amount, price);
    }


    @Override
    public String toString() {
        return "Karaoke{" +
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

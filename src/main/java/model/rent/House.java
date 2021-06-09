package model.rent;

import model.RentService;

public class House extends RentService {

    /**
     * tiêu chuẩn phòng;
     */
    private String rate;
    /**
     * mô tả tiện nghi khác.
     */
    private String description;

    /**
     * số tầng
     */
    private int numberFloors;

    public House(String id, String name, int usableArea, double rentalCost, int maxNumberPeople, String rentalType, String rate, String description, int numberFloors) {
        super(id, name, usableArea, rentalCost, maxNumberPeople, rentalType);
        this.rate = rate;
        this.description = description;
        this.numberFloors = numberFloors;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberPeople=" + maxNumberPeople +
                ", rentalType=" + rentalType +
                ", id='" + id + '\'' +
                ", rate='" + rate + '\'' +
                ", description='" + description + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }

    @Override
    public String showInfo() {
        return toString();
    }
}

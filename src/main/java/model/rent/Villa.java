package model.rent;

import model.RentService;

public class Villa extends RentService {
    /**
     * tiêu chuẩn phòng;
     */
    private String rate;
    /**
     * mô tả tiện nghi khác.
     */
    private String description;
    /**
     * diện tích bể bơi.
     */
    private int poolArea;

    /**
     * số tầng
     */
    private int numberFloors;

    public Villa(String id, String name, int usableArea, double rentalCost, int maxNumberPeople, String rentalType, String rate, String description, int poolArea, int numberFloors) {
        super(id, name, usableArea, rentalCost, maxNumberPeople, rentalType);
        this.rate = rate;
        this.description = description;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    @Override
    public String showInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Villa{" +
                "name='" + name + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberPeople=" + maxNumberPeople +
                ", rentalType=" + rentalType +
                ", id='" + id + '\'' +
                ", rate='" + rate + '\'' +
                ", description='" + description + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors +
                '}';
    }
}

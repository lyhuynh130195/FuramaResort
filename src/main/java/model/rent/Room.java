package model.rent;

import model.RentService;

public class Room extends RentService {
    /**
     * Dịch vụ miễn phí đi kèm
     */
    String freeServicesIncluded;

    public Room(String id, String name, int usableArea, double rentalCost, int maxNumberPeople, String rentalType, String freeServicesIncluded) {
        super(id, name, usableArea, rentalCost, maxNumberPeople, rentalType);
        this.freeServicesIncluded = freeServicesIncluded;
    }

    public String getFreeServicesIncluded() {
        return freeServicesIncluded;
    }

    public void setFreeServicesIncluded(String freeServicesIncluded) {
        this.freeServicesIncluded = freeServicesIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxNumberPeople=" + maxNumberPeople +
                ", rentalType=" + rentalType +
                ", id='" + id + '\'' +
                ", freeServicesIncluded=" + freeServicesIncluded +
                '}';
    }

    @Override
    public String showInfo() {
        return toString();
    }


}

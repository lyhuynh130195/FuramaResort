package model;

public abstract class RentService extends Services {
    /**
     * Tên dịch vụ
     */
    protected String name;

    /**
     * Diện tích sử dụng
     */
    protected int usableArea;

    /**
     * Chi phí thuê
     */
    protected double rentalCost;

    /**
     * Số lượng người tối đa
     */
    protected int maxNumberPeople;

    /**
     * Kiểu thuê
     */
    protected String rentalType;

    public RentService(String id, String name, int usableArea, double rentalCost, int maxNumberPeople, String rentalType) {
        super(id);
        this.name = name;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxNumberPeople = maxNumberPeople;
        this.rentalType = rentalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumberPeople() {
        return maxNumberPeople;
    }

    public void setMaxNumberPeople(int maxNumberPeople) {
        this.maxNumberPeople = maxNumberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}

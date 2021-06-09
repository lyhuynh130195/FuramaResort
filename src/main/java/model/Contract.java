package model;

public class Contract {
    private String id;
    private String startDate;
    private String endDate;
    private double preDeposit;
    private double totalPayment;

    public Contract() {
    }

    public Contract(String id, String startDate, String endDate, double preDeposit, double totalPayment) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.preDeposit = preDeposit;
        this.totalPayment = totalPayment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getPreDeposit() {
        return preDeposit;
    }

    public void setPreDeposit(double preDeposit) {
        this.preDeposit = preDeposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
}

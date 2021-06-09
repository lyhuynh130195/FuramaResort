package model;

/**
 * Dịch vụ đi kèm sẽ bao gồm các thông tin: Tên dịch vụ đi kèm, Đơn vị, Giá tiền
 */
public abstract class AccompaniedService extends Services {
    /**
     * Tên dịch vụ đi kèm
     */
    protected String name;

    /**
     * Đơn vị
     */
    protected int amount;

    /**
     * Giá tiền
     */
    protected double price;

    public AccompaniedService(String id, String name, int amount, double price) {
        super(id);
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public String toString() {
        return "AccompaniedService{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

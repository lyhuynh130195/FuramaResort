package model;

public class Ticket {
    private String nameCustomer;
    private String nameMove;
    private int numberSeats;

    public Ticket() {
    }

    public Ticket(String nameCustomer, String nameMove, int numberSeats) {
        this.nameCustomer = nameCustomer;
        this.nameMove = nameMove;
        this.numberSeats = numberSeats;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getNameMove() {
        return nameMove;
    }

    public void setNameMove(String nameMove) {
        this.nameMove = nameMove;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", nameMove='" + nameMove + '\'' +
                ", numberSeats='" + numberSeats + '\'' +
                '}';
    }
}

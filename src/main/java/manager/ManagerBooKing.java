package manager;

import dao.BookingDao;
import dao.CustomerDao;
import dao.impl.HouseDao;
import dao.impl.RoomDao;
import dao.impl.VillaDao;
import model.Booking;
import model.Customer;
import model.rent.House;
import model.rent.Room;
import model.rent.Villa;

import java.util.List;
import java.util.Scanner;

public class ManagerBooKing {
    private static CustomerDao customerDao = new CustomerDao();

    public static void addNewBooking() {
        String name = choiceCustomer();
        String id=choiceRentService();
        Booking booking = new Booking(name,id);
        BookingDao bookingDao = new BookingDao();
        bookingDao.add(booking);
    }

    private static String choiceCustomer() {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customerList = customerDao.getInformationCustomers();
        boolean flag;
        int choice;

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + customerList.get(i).showInfo());
        }
        System.out.println("Chọn khách hàng booking");

        do {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > customerList.size()) {
                System.out.println("Mời nhập lại stt khách hang");
                flag = true;
            } else {
                System.out.println("Khách hang lựa chọn là");
                System.out.println(customerList.get(choice - 1).showInfo());
                flag = false;
            }
        } while (flag);
        return customerList.get(choice - 1).getFullName();
    }

    private static String choiceRentService() {
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("Vui lòng Booking dịch vụ :");
            System.out.println("1.Booking Villa\n" +
                    "2.Booking House\n" +
                    "3.Booking Room");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    id = addNewBookingVilla();
                    return id;
                case 2:
                    id = addNewBookingHouse();
                    return id;
                case 3:
                    id = addNewBookingRoom();
                    return id;
                default:
                    System.out.println("Không có lựa chọn này, vui lòng nhập lại :");
            }
        }
    }

    private static String addNewBookingVilla() {
        VillaDao villaDao =new VillaDao();
        List<Villa> villaList = villaDao.getListVilla();
        int choice;
        Scanner scanner =new Scanner(System.in);
        boolean flag;

        for (int i = 0; i < villaList.size(); i++) {
            System.out.println((i+1)+villaList.get(i).showInfo());
        }
        System.out.println("Chọn villa muốn booking ");
        do{
            choice =Integer.parseInt(scanner.nextLine());
            if(choice<1||choice> villaList.size()){
                System.out.println("Mời chọn lại");
                flag=true;
            }else {
                System.out.println("Villa đã chọn");
                System.out.println(villaList.get(choice-1).showInfo());
                flag=false;
            }
        }while (flag);
        return villaList.get(choice-1).getId();
    }

    private static String addNewBookingHouse() {
        HouseDao houseDao =new HouseDao();
        List<House> houseList = houseDao.getListHouse();
        int choice;
        Scanner scanner =new Scanner(System.in);
        boolean flag;

        for (int i = 0; i < houseList.size(); i++) {
            System.out.println((i+1)+houseList.get(i).showInfo());
        }
        System.out.println("Chọn house muốn booking ");
        do{
            choice =Integer.parseInt(scanner.nextLine());
            if(choice<1||choice> houseList.size()){
                System.out.println("Mời chọn lại");
                flag=true;
            }else {
                System.out.println("House đã chọn");
                System.out.println(houseList.get(choice-1).showInfo());
                flag=false;
            }
        }while (flag);
        return houseList.get(choice-1).getId();
    }

    private static String addNewBookingRoom() {
        RoomDao roomDao =new RoomDao();
        List<Room> roomList = roomDao.getListRoom();
        int choice;
        Scanner scanner =new Scanner(System.in);
        boolean flag;

        for (int i = 0; i < roomList.size(); i++) {
            System.out.println((i+1)+roomList.get(i).showInfo());
        }
        System.out.println("Chọn room muốn booking ");
        do{
            choice =Integer.parseInt(scanner.nextLine());
            if(choice<1||choice> roomList.size()){
                System.out.println("Mời chọn lại");
                flag=true;
            }else {
                System.out.println("room đã chọn");
                System.out.println(roomList.get(choice-1).showInfo());
                flag=false;
            }
        }while (flag);
        return roomList.get(choice-1).getId();
    }


}

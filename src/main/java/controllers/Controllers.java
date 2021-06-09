package controllers;

import manager.*;
import model.Cabinet;

import java.util.Scanner;

public class Controllers {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Nhập vào vừa lựa chọn của bạn ");
            System.out.println("1. Add New Services \n" +
                    "2.Show Services \n" +
                    "3.Add New Customer \n" +
                    "4.Show Information of Customer \n" +
                    "5.Add New Booking \n" +
                    "6.Show Information of Employee \n" +
                    "7.Add Ticket\n" +
                    "8.Show ListTicket \n" +
                    "9.Find employee \n"+
                    "10.Exit");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    ManagerService.addNewService();
                    break;
                case "2":
                    ManagerService.showService();
                    break;
                case "3":
                    ManagerCustomer.addNewCustomer();
                    break;
                case "4":
                    ManagerCustomer.showInformationCustomers();
                    break;
                case "5":
                    ManagerBooKing.addNewBooking();
                    break;
                case "6":
                    ManagerEmployee.ShowInformationOfEmployee();
                    break;
                case "7":
                    ManagerCinema4D.addTicket();
                    break;
                case "8":
                    ManagerCinema4D.showTicket();
                    break;
                case "9":
                    Cabinet.findFileOfEmployee();
                    break;
                case "10":
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập lại lựa chọn");
            }
        } while (flag);
    }
}

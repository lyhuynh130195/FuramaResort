package manager;

import dao.CustomerDao;
import model.Customer;
import model.Ticket;

import java.util.*;

public class ManagerCinema4D {
    private static int numberSeats = 0;
    private static Queue<Ticket> listTicket = new LinkedList<>();
    private static CustomerDao customerDao = new CustomerDao();


    public static void showTicket() {
        while (!listTicket.isEmpty()) {
            System.out.println(listTicket.poll());
        }
    }

    public static void addTicket() {
        String nameCustomer = choiceCustomer();
        String nameMove = choiceMove();
        int numberSeatsNew = numberSeats;
        Ticket ticket = new Ticket(nameCustomer, nameMove, numberSeatsNew);
        listTicket.add(ticket);
    }

    private static String choiceMove() {
        List<String> listMove = new ArrayList<>();
        listMove.add("Batman");
        listMove.add("Goodfellas");
        listMove.add("Terminator 2");
        listMove.add("Reservoir Dogs");
        listMove.add("Jurassic Park");
        int choice;
        boolean flag;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn bộ phim muốn xem");
        for (int i = 0; i < listMove.size(); i++) {
            System.out.println((i + 1) + " : " + listMove.get(i));
        }

        do {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > listMove.size()) {
                flag = true;
            } else {
                System.out.println("Bạn đã chọn phim " + listMove.get(choice - 1));
                numberSeats++;
                flag = false;
            }

        } while (flag);
        return listMove.get(choice-1);
    }

    private static String choiceCustomer() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int chose;
        System.out.println("Chọn khách hàng mua vé ");
        List<Customer> listCustomer = customerDao.getInformationCustomers();

        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println((i + 1) + listCustomer.get(i).showInfo());
        }
        do {
            chose = Integer.parseInt(scanner.nextLine());
            if (chose < 1 || chose > listCustomer.size()) {
                System.out.println("Mời nhập lại ");
                flag = true;
            } else {
                System.out.println("Khách hàng " + "full name " + listCustomer.get(chose - 1).getFullName());
                flag=false;
            }
        } while (flag);
        return listCustomer.get(chose - 1).getFullName();
    }
}

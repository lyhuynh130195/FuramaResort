package manager;

import dao.CustomerDao;
import enum_service.CustomerType;
import model.Customer;
import validate.CheckInputCustomer;

import java.util.Scanner;

public class ManagerCustomer {
    public static void addNewCustomer() {
        Customer customer = creatNewCustomer();
        CustomerDao customerDao = new CustomerDao();
        customerDao.add(customer);
    }

    private static Customer creatNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        Customer customer = null;
        boolean flag ;
        do {
            try {
                System.out.println("Nhập vào thông tin customer cần thêm");

                String fullName = CheckInputCustomer.checkName(scanner);

                String birthday = CheckInputCustomer.checkBirthday(scanner);

                String gender = CheckInputCustomer.checkGender(scanner);

                String idCardNumber = CheckInputCustomer.checkIDCard(scanner);

                System.out.println("Số điện thoại :");
                String phoneNumber = scanner.nextLine();

                String email = CheckInputCustomer.checkEmail(scanner);

                System.out.println("Loại khách hàng");
                CustomerType level = CustomerType.valueOf(scanner.nextLine());

                System.out.println("Địa chỉ");
                String address = scanner.nextLine();

                customer = new Customer(fullName, birthday, gender, idCardNumber, phoneNumber, email, level, address);
                flag = false;
            } catch (Exception exception) {
                exception.getStackTrace();
                flag=true;
            }
        } while (flag);

        return customer;
    }

    public static void showInformationCustomers() {
        CustomerDao customerDao = new CustomerDao();
        customerDao.showInformationCustomer();
    }

}

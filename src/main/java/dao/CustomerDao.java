package dao;

import model.Customer;
import until.AbstractDao;
import until.FileCSVDao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerDao {
    private final String path = "Case_study2/src/main/java/data/customer.csv";
    private final AbstractDao<Customer> customerAbstractDao = new FileCSVDao<>(path, Customer.class);

    public String getPath() {
        return path;
    }

    public AbstractDao<Customer> getCustomerAbstractDao() {
        return customerAbstractDao;
    }

    public CustomerDao() {

    }

    public void add(Customer customer) {
         customerAbstractDao.save(customer);
    }


//    public void showInformationOfCustomer() {
//        List<Customer> customerList = customerAbstractDao.showList();
//        customerList.forEach(customer -> System.out.println(customer.showInfo()));
//    }

    /**
     * Cài đặt lại phương thức showInformationCustomer()
     * để dữ liệu xuất ra được sắp xếp theo thứ tự Alpha B theo tên của từng Customer.
     */
    public void showInformationCustomer() {
        List<Customer> list = customerAbstractDao.showList();
        Collections.sort(list);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        for (Customer customer : list) {
            System.out.println(customer.showInfo());
        }
    }

    public List<Customer> getInformationCustomers() {
        return customerAbstractDao.showList();
    }


}

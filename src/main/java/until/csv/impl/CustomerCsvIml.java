package until.csv.impl;

import enum_service.CustomerType;
import model.Customer;
import until.csv.CsvUtilImpl;

import java.util.Map;

public class CustomerCsvIml extends CsvUtilImpl {
    public Customer fromCsv(String csvLine) {
        Map<String, String> map = getMapFieldNameAndValue(csvLine, Customer.class);

        String fullName = map.get("fullName");
        String birthday = map.get("birthday");
        String gender = map.get("gender");
        String idCardNumber = map.get("idCardNumber");
        String phoneNumber = map.get("phoneNumber");
        String email = map.get("email");
        CustomerType level =CustomerType.valueOf( map.get("level"));
        String address = map.get("address");
        Customer customer=new Customer(fullName,birthday,gender,idCardNumber,phoneNumber,email,level,address);

        return customer;
    }
}

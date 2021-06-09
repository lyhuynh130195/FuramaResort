package until.csv.impl;

import model.Customer;
import model.Employee;
import until.csv.CsvUtilImpl;

import java.util.Map;

public class EmployeeScvIml extends CsvUtilImpl {
    public Employee fromCsv(String csvLine) {
        Map<String, String> map = getMapFieldNameAndValue(csvLine, Customer.class);

        String fullName = map.get("fullName");
        String birthday = map.get("birthday");
        String address = map.get("address");
        Employee employee = new Employee(fullName,birthday,address);
        return employee;
    }
}

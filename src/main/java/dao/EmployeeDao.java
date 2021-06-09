package dao;

import model.Employee;
import until.AbstractDao;
import until.FileCSVDao;

import java.util.List;

public class EmployeeDao {
    private final String path = "Case_study2/src/main/java/data/employee.csv";
    private final AbstractDao<Employee> employeeAbstractDao =new FileCSVDao<>(path,Employee.class);

    public EmployeeDao() {
    }

    public void add(Employee employee){
        employeeAbstractDao.save(employee);
    }

    public List<Employee> getInformationEmployees(){
       return employeeAbstractDao.showList();
    }

}

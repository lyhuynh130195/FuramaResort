package manager;

import dao.EmployeeDao;
import model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerEmployee {
    public static void addEmployee(Employee employee){
        EmployeeDao employeeDao= new EmployeeDao();
        employeeDao.add(employee);
    }

    public static Map<Integer,Employee> getMapOfEmployee(){
        EmployeeDao employeeDao =new EmployeeDao();
        List<Employee> employeeList =employeeDao.getInformationEmployees();
        Map<Integer,Employee> map =new HashMap<>();

        for (int i = 0; i < employeeList.size(); i++) {
            map.put(i+100,employeeList.get(i));
        }
        return map;
    }
    public static void ShowInformationOfEmployee(){

        Map<Integer,Employee> map =getMapOfEmployee();

        for(Map.Entry<Integer,Employee> employeeEntry : map.entrySet()){
            System.out.println(employeeEntry);
        }
    }
    public static void addEmployee(){
        addEmployee(new Employee("Hai","19","DN"));
        addEmployee(new Employee("An","20","DN"));
        addEmployee(new Employee("Tai","18","DN"));
        addEmployee(new Employee("Phuc","18","DN"));
        addEmployee(new Employee("Linh","18","DN"));
        addEmployee(new Employee("Duc","18","DN"));
        addEmployee(new Employee("Hung","18","DN"));
        addEmployee(new Employee("Van","18","DN"));
        addEmployee(new Employee("Quang","18","DN"));
        addEmployee(new Employee("Long","18","DN"));
    }
}

package model;


import dao.EmployeeDao;
import manager.ManagerEmployee;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Cabinet {
    private static Stack<Employee> employeeStack = new Stack<>();
    private static EmployeeDao employeeDao =new EmployeeDao();

    static {
        Map<Integer,Employee> employeeMap = ManagerEmployee.getMapOfEmployee();
        for(Map.Entry<Integer,Employee> employeeEntry : employeeMap.entrySet()){
            employeeStack.push(employeeEntry.getValue());
        }
    }

    private static Employee getOfEmployee(String fullName){
        Employee employee =null;
        while (!employeeStack.isEmpty()){
            employee =employeeStack.pop();
            if(employee.getFullName().equals(fullName)){
                return employee;
            }
        }
        return null;
    }

    public static void findFileOfEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên cần tìm kiếm ");
        String fullName =scanner.nextLine();

        Employee employee =getOfEmployee(fullName);
        if(employee!=null){
            System.out.println("Thong tin nhan vien "+employee);
        }else {
            System.out.println("Không có nhân viên này trong hồ sơ");
        }
    }

}

//package main;
//
//import dao.EmployeeDao;
//import dao.EmployeeDaoImpl;
//import entity.Employee;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Employee employee = new Employee();
//
//        employee.setId(101);
//        employee.setName("Likith");
//        employee.setEmail("likith@gmail.com");
//        employee.setSalary(60000);
//
//        EmployeeDao dao = new EmployeeDaoImpl();
//
//        dao.save(employee);
//
//    }
//}
package main;

import entity.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setId(101);
        employee.setName("Likith");
        employee.setEmail("likith@gmail.com");
        employee.setSalary(55000);

        EmployeeService service = new EmployeeServiceImpl();

        service.saveEmployee(employee);

        System.out.println("Employee Saved Successfully");

    }

}

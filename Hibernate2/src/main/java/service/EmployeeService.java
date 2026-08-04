package service;

import entity.Employee;
import java.util.List;

public interface EmployeeService {

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);

    List<Employee> getAllEmployees();

}

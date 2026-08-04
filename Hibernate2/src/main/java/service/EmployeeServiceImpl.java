package service;

import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDaoImpl();

    @Override
    public void saveEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDao.delete(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

}
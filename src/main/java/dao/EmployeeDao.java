package dao;

import java.util.List;

import entity.Employee;

public interface EmployeeDao {
	
	void save(Employee employee);

    Employee findById(int id);

    List<Employee> findAll();

    void update(Employee employee);

    void delete(int id);
}

package dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Employee;
import util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void save(Employee employee) {

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(employee);

        transaction.commit();

        session.close();

        System.out.println("Employee Saved Successfully");

    }

    @Override
    public Employee findById(int id) {

        Session session = sessionFactory.openSession();

        Employee employee = session.get(Employee.class, id);

        session.close();

        return employee;

    }

    @Override
    public List<Employee> findAll() {

        Session session = sessionFactory.openSession();

        List<Employee> employees = session
                .createQuery("from Employee", Employee.class)
                .list();

        session.close();

        return employees;

    }

    @Override
    public void update(Employee employee) {

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.merge(employee);

        transaction.commit();

        session.close();

        System.out.println("Employee Updated Successfully");

    }

    @Override
    public void delete(int id) {

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Employee employee = session.get(Employee.class, id);

        if (employee != null) {

            session.remove(employee);

            System.out.println("Employee Deleted Successfully");

        } else {

            System.out.println("Employee Not Found");

        }

        transaction.commit();

        session.close();

    }

}

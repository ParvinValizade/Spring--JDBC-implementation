package az.spring.jdbc.dao;

import az.spring.jdbc.model.Employee;

import java.util.List;

public interface EmployeeDao {
    void insert(Employee employee);

    void update(Employee employee);

    void delete(int id);

    Employee getEmployee(int id);

    List<Employee> getAllEmployees();

    long count();
}

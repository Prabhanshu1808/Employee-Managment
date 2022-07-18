package com.employee.services;

import com.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

     boolean deleteEmployee(Long id);

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}

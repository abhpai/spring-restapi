package com.syncron.abhpai.springrestapi.service;

import com.syncron.abhpai.springrestapi.model.Employee;

import java.util.List;

public interface EmployeeService {

    public String createNewEmployee(Employee employee);
    public String updateEmployee(Employee employee, Long id);
    public String deleteEmployee(Long id);
    public Employee getSingleEmployee(Long id);
    public List<Employee> getAllEmployee();
}

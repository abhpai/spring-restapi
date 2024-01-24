package com.syncron.abhpai.springrestapi.service.implement;

import com.syncron.abhpai.springrestapi.model.Employee;
import com.syncron.abhpai.springrestapi.repository.EmployeeRepo;
import com.syncron.abhpai.springrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public String createNewEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "Employee created";
    }

    @Override
    public String updateEmployee(Employee employee, Long id) {
        employeeRepo.deleteById(id);
        employeeRepo.save(employee);
        return "Employee Updated";
    }

    @Override
    public String deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
        return "Employee" + id + "Deleted";
    }

    @Override
    public Employee getSingleEmployee(Long id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

}

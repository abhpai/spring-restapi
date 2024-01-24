package com.syncron.abhpai.springrestapi.controller;

import com.syncron.abhpai.springrestapi.model.Employee;
import com.syncron.abhpai.springrestapi.service.EmployeeService;
import com.syncron.abhpai.springrestapi.service.implement.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;
    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.createNewEmployee(employee);
        return "Employee added successfully";
    }

    @GetMapping("/getall")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PutMapping("/update/{id}")
    public String updateEmployee(@RequestBody Employee employee,@PathVariable("id") Long id){
        return employeeService.updateEmployee(employee,id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return "Employee" + id + "deleted";
    }

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable("id") Long id){
        return employeeService.getSingleEmployee(id);
    }
}

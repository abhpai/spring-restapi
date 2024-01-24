package com.syncron.abhpai.springrestapi.repository;

import com.syncron.abhpai.springrestapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}

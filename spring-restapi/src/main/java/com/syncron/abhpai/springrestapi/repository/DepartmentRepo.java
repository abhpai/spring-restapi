package com.syncron.abhpai.springrestapi.repository;

import com.syncron.abhpai.springrestapi.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
}

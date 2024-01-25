package com.syncron.abhpai.springrestapi.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Department {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long dept_id;
    private String dept_name;
    private Long dept_manager_id;

    public Department() {
    }

    public Department(Long dept_id, String dept_name, Long dept_manager_id) {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.dept_manager_id = dept_manager_id;
    }

    public Long getDept_id() {
        return dept_id;
    }

    public void setDept_id(Long dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Long getDept_manager_id() {
        return dept_manager_id;
    }

    public void setDept_manager_id(Long dept_manager_id) {
        this.dept_manager_id = dept_manager_id;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department", targetEntity = Employee.class)
    //@JoinColumn(name = "dep_fk", referencedColumnName = "dept_id")
    private List<Employee> employeeList;
}

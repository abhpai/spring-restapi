package com.syncron.abhpai.springrestapi.model;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String phoneNumber;
    private String pinCode;

    public Employee() {
    }

    public Employee(long id, String name, String phoneNumber, String pinCode) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pinCode = pinCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

//    @OneToOne
//    @JoinTable(name = "emp_address", joinColumns = {@JoinColumn(name = "emp_id", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "address_id", referencedColumnName = "add_id")})
//    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

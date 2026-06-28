package com.xworkz.product.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
    private String empId;
    private String name;
    private String dept;
    private String designation;
    private Double salary;

    public EmployeeDTO(String empId, String name, String dept, String designation, Double salary) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.designation = designation;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

package com.java8.util4;


public class Employee {

    private Long employeeId;
    private String name;

    public Employee(Long employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/* @Fetch(value = FetchMode.JOIN)
    private ErrorMessage errorMessage;*/

}

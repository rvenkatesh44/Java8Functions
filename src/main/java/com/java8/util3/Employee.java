package com.java8.util3;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 6L;

    String EmpName;
    byte EmpAge;

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public byte getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(byte empAge) {
        EmpAge = empAge;
    }
}

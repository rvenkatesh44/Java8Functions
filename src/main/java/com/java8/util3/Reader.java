package com.java8.util3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Employee employee = new Employee();
        FileInputStream fin = new FileInputStream("C:\\Venkatesh\\employee.obj");
        ObjectInputStream ois = new ObjectInputStream(fin);
        employee = (Employee) ois.readObject();
        ois.close();
        System.out.println(employee.getEmpName());
    }

}

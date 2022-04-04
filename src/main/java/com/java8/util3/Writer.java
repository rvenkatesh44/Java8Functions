package com.java8.util3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writer {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpName("Venkatesh");
        employee.setEmpAge((byte) 30);
        try {
        FileOutputStream fout = new
                FileOutputStream("C:\\Venkatesh\\employee.obj");
        ObjectOutputStream oos = null;

            oos = new ObjectOutputStream(fout);


        oos.writeObject(employee);
        oos.close();
        System.out.println("Process complete");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

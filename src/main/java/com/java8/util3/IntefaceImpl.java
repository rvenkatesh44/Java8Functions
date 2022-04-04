package com.java8.util3;

public class IntefaceImpl implements interface1,interface2{

    @Override
    public void calcDimensity() {

    }

    @Override
    public void printMain() {
        System.out.println("IntefaceImpl.printMain");
    }


    public static void main(String[] args) {
        interface1.printStaticMain();
        interface1 intefaceImpl = new IntefaceImpl();
        intefaceImpl.printMain();
    }
}

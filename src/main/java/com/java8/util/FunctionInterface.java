package com.java8.util;


public class FunctionInterface  extends  abtstractClass {
    public static void main(String[] args) {
        FunctionInterfaceTest functionInterface = () -> System.out.println("op");
        functionInterface.ab();
        functionInterface.method2();
        FunctionInterfaceTest.method3();

        SimpleTest st = (a) -> System.out.println(a*a*a);
        st.ab(3);
        FunctionInterface FunctionInterface = new FunctionInterface();
        FunctionInterface.implementedMethod();
    }
    public void implementedMethod() { super.implementedMethod(); }
    public void abstractMethod() { System.out.print("abstractMethod()"); }

}

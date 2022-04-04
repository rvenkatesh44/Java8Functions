package com.java8.util3;

import java.util.concurrent.ConcurrentHashMap;

public class SingletonExample extends Throwable {
    static private SingletonExample singletonExample = null;

    static public  SingletonExample getInstance() {
        if(singletonExample==null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }
    public SingletonExample(String name ){
        System.out.println(" SingletonExample name = " + name);
    }
    private SingletonExample() {
        System.out.println("SingletonExample.SingletonExample");
    }
    static {
        System.out.println("SingletonExample.static initializer");
    }
    {
        System.out.println("SingletonExample.instance initializer");
    }
    public static void main(String[] args)   {
        SingletonExample singletonExample1 = new SingletonExample("name");
        Error error;
        Throwable throwable;
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
    }

}

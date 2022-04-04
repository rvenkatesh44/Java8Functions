package com.java8.util3;

import java.util.Arrays;
import java.util.List;

public class RecursiveJava {
  /*  public RecursiveJava (String name) {
        System.out.println("RecursiveJava.RecursiveJava Parameter");
        System.out.println(" name = " + name);
    }*/

   /* public RecursiveJava() {
        System.out.println("RecursiveJava.RecursiveJava");
    }*/

    static int recSearch(List<Integer> arr, int l, int r, int x)
    {
        if (r < l){
            System.out.println("arr = " + arr + ", l = " + l + ", r = " + r + ", x = " + x);
            return -1;
        }

        if (arr.get(l) == x) {
            System.out.println("arr = " + arr + ", l = " + l + ", r = " + r + ", x = " + x);
            return l;
        }

        if (arr.get(l) == x){
            System.out.println("arr = " + arr + ", l = " + l + ", r = " + r + ", x = " + x);
            return r;
        }

        return recSearch(arr, l+1, r-1, x);
    }
    public static void main(String[] args)
    {
        SingletonExample singletonExample1 =  SingletonExample.getInstance();
        int x = 3;
        List<Integer> arr = Arrays.asList(1,3,4,7);
        int index = recSearch(arr, 0, arr.size()-1, x);
        if (index != -1)
            System.out.println("  Present = " + arr.get(index));
        else
            System.out.println("Not Present = " + index);
    }

}

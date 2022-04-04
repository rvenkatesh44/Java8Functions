package com.java8.util4;

public class TreeImpl {
    private static void check(Tree tree,int h) {
        tree.display(h);
        if(tree.climb(h,10)){
            System.out.println("tree = " + tree + ", h = " + h);
            System.out.println("if");
        }else {
            System.out.println("tree = " + tree + ", h = " + h);
            System.out.println("else");
        }
    }

    public static void main(String[] args) {
       // check((h, t) -> new String(new StringBuilder(h).append(t)).isEmpty(),15);
        System.out.println("1".isEmpty());
        check((h, t) -> "1".isEmpty(),1);
    }


}
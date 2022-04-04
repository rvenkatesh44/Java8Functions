package com.java8.util3;

import java.util.HashMap;
import java.util.Map;

public class AtmWithDraw {
    public static void main(String[] args) {
        int dispenseAmount=1300;
        int N=4;
        int denominations[]={5000,1000,100,200};
        int denominationCount[]={2,1,3,0};
        withDrawAmount(dispenseAmount,N,denominations,denominationCount);
    }

    static String withDrawAmount(int dispenseAmount, int N, int[] denominations, int[] denominationCount){

        // Write your code here
        String output = null;
        int tempDispenseAmount = 0;
        int  tempDispenseAmountRem= 0;
        int tempCount=0;
        while(dispenseAmount!=0) {
            for(int i=0;i<denominations.length ;i++) {
                if(dispenseAmount>=denominations[i])
                    System.out.println("denominations = " + denominations[i]);
                    System.out.println("No of "+denominations[i]+"'s"+" :"+dispenseAmount/denominations[i]);
                dispenseAmount=dispenseAmount%denominations[i];
                System.out.println("dispenseAmount = " + dispenseAmount);
            }
        }




        return output;

    }
}

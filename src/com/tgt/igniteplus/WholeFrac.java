package com.tgt.igniteplus;

import java.math.BigDecimal;
import java.util.Scanner;

public class WholeFrac {
    public  static  void main(String[] args){
        System.out.println();
        double doubleNumber=0.0,frac=0.0;

        Scanner in=new Scanner(System.in);
        System.out.println("enter a double number : ");
        doubleNumber=in.nextDouble();
        BigDecimal bigDecimal=new BigDecimal(String.valueOf(doubleNumber));
        int intVal=bigDecimal.intValue();

        System.out.println("double number: = "+doubleNumber+"\nwhole part = "+intVal+"\nfrac part = "+bigDecimal.subtract(new BigDecimal(intVal)).toPlainString());

    }
}
/*
enter a double number :
-4354.654654
double number: = -4354.654654
whole part = -4354
frac part = -0.654654
 */
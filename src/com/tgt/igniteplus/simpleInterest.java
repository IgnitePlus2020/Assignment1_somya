package com.tgt.igniteplus;

import java.util.Scanner;

public class simpleInterest {
    public static  void main(String args[]){
        Scanner in=new Scanner(System.in);

        float p,r,t,interest;
        System.out.println("enter principal :");
        p=in.nextFloat();
        System.out.println("enter annual rate in percentage:");
        r=in.nextFloat();
        System.out.println("enter term in years :");
        t=in.nextFloat();

        System.out.println("simple interest is : "+ ((p*r*t)/100));

    }
}
/*
enter principal :
70000
enter annual rate in percentage:
4
enter term in years :
3
simple interest is : 8400.0
 */
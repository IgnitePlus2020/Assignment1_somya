package com.tgt.igniteplus;

import java.util.Scanner;
// prog calculating X^n
public class Power {
    public  static  void  main(String[] args ){
        int X,n;
        long res=1;
        Scanner in=new Scanner(System.in);
        System.out.print("enter base val : ");
        X=in.nextInt();
        System.out.print("enter exponent val : ");
        n=in.nextInt();
        while (n-->0) {
           res*=X;
        }
        System.out.print(res);

    }
}
/*
enter base val : 2
enter exponent val : 5
32
 */
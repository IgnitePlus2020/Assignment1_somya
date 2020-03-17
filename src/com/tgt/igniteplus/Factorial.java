package com.tgt.igniteplus;

import java.math.BigInteger;
import java.util.Scanner;
//  calculating factorial of a number
public class Factorial {
    public  static  void  main(String[] args){
        int n;
        Scanner in  =new Scanner(System.in);
        n=in.nextInt();
        BigInteger fact=BigInteger.ONE;
        for (int i = 1; i <=n ; i++) {
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        System.out.print(fact);

    }
}
/*
20
2432902008176640000
 */
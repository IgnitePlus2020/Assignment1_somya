package com.tgt.igniteplus;

import java.util.Scanner;

public class Fibonacci {
    static  int fib(int n){
        if (n<=1)
            return  n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[]args){
        int n;

        Scanner in  =new Scanner(System.in);
        n=in.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.print(fib(i)+"  ");
        }

    }
}
/*
15
0  1  1  2  3  5  8  13  21  34  55  89  144  233  377
 */
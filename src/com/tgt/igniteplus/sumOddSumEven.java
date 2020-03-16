package com.tgt.igniteplus;
import java.util.Scanner;
//program to find separately sum of odd and even numbers from 1 to n
public class sumOddSumEven {
    public  static  void  main(String [] args){
        int n,sumEven=0,sumOdd=0;
        Scanner in=new Scanner(System.in);
        System.out.print("N= ");
        n=in.nextInt();
        for (int i = 0; i <=n ; i++) {
            if(i%2==0)
                sumEven+=i;
            else sumOdd+=i;

        }
        System.out.println("Even sum = "+sumEven +"\nOdd sum = "+sumOdd);


    }
}
/*
N= 11
Even sum = 30
Odd sum = 36

 */
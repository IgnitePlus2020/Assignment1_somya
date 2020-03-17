package com.tgt.igniteplus;

import java.util.Scanner;
/*
3 digit Armstrong numbers are of the form :     abc=a^3+b^3+c^3
*/

public class Armstrong {
    public  static  void  main(String[] args){
        long n;
        Scanner in  =new Scanner(System.in);
        n=in.nextInt();
        if(n == Armstrong(n))
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");


    }
    public static long Armstrong(long n){
        long remainder,result=0;
        while (n>0){
            remainder=n%10;
            result+=Math.pow(remainder,3);
            n/=10;
            //System.out.println(result);
        }
        return result;

    }
}
/*
371
371 is an Armstrong number.
*************************************
123
123 is not an Armstrong number.

 */
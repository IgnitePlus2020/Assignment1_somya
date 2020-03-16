package com.tgt.igniteplus;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String []args){
        long num;
        char temp;
        Scanner in=new Scanner(System.in);
        num=in.nextLong();

        String numStr=Long.toString(num);
        int strlen=numStr.length();

        char[] numArray;
        numArray=numStr.toCharArray();


        for (int i = 0; i <strlen/2 ; i++) {
           temp=numArray[i];
           numArray[i]=   numArray[strlen-i-1];
            numArray[strlen-i-1]= temp;

        }

        System.out.println(numArray);

    }
}
/*
123456789
987654321
 */
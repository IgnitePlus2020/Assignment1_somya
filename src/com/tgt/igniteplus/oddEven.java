package com.tgt.igniteplus;

import java.util.Scanner;

public class oddEven {
    public static void main(String [] args){
        int num;
        System.out.println("enter a number : ");
        Scanner in =new Scanner(System.in);
        num=in.nextInt();
        if(num%2==0)
            System.out.println("even number ");
        else
            System.out.println("odd number ");

    }
}

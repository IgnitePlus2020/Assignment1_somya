package com.tgt.igniteplus;

import java.util.*;


public class max2num {
    public  static  void main(String [] args){
        Scanner in=new Scanner(System.in);
        int num[]=new int[3];
        System.out.print("enter three numbers : ");
        for (int i = 0; i <3 ; i++) {
            num[i]=in.nextInt();
        }
        Arrays.sort(num);
        System.out.println("largest: "+num[2]+"\nSecond largest: "+num[1]);
    }
}
/*
enter three numbers : 10 5 25
largest: 25
Second largest: 10
 */
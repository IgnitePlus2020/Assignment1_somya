package com.tgt.igniteplus;

import java.util.Arrays;
import java.util.Scanner;

public class Swap3num {
    public static  void main(String[] args){
        int num[],temp;
        //input
        Scanner in=new Scanner(System.in);
        num=new int[3];
        for (int i = 0; i <3 ; i++) {
            num[i]=in.nextInt();

        }

        //rotate
        temp=num[0];
        for (int i = 0; i <2 ; i++) {
            num[i]=num[i+1] ;
        }
        num[2]=temp;

        //print

        for (int i = 0; i <3 ; i++) {
            System.out.print(num[i]+"\t");
        }



    }



}

/*
44
676
344
676	344	44
 */

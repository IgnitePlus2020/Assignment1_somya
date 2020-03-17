package com.tgt.igniteplus;

import java.util.Scanner;
//convert bin to int
public class BinToDec {
    public static  void  main(String[] args){
        int n=0,len=0,pow=0;
        String bin;
        Scanner in=new Scanner(System.in);
        bin=in.nextLine();
        len=bin.length();

        //System.out.print(len);
        for (int i = 0; i <len; i++) {
            int val=bin.charAt(i)-'0';
            //System.out.print(" index :  "+i+"\t"+val+"\t");
            n+=(val*Math.pow(2,len-1-i));
            //System.out.println(n);
        }
        System.out.print(n);

    }
}
/*
1100100
100
 */
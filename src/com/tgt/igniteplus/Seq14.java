package com.tgt.igniteplus;

import java.util.Scanner;

public class Seq14 {
    public static void main(String[]args){
        int n;

        Scanner in  =new Scanner(System.in);
        n=in.nextInt();
        seqFunc(n);
    }
    public  static void  seqFunc(int len){
        int[] n=new int[1000];

        n[0]=1;n[1]=4;n[2]=7;
        System.out.print(n[0]+"\t"+n[1]+"\t"+n[2]+"\t");

        for (int i = 3; i <len ; i++) {
            n[i]=n[i-1]+n[i-2]+n[i-3];
            System.out.print(n[i]+"\t");
        }
    }
}
/*
10
1	4	7	12	23	42	77	142	261	480
 */
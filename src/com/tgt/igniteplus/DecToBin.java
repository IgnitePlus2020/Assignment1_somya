package com.tgt.igniteplus;
//convert decimal to bin
import java.util.Scanner;

public class DecToBin {
    public static  void  main(String[] args){
        int n,len=0;
        int[] bin=new int[64];
        Scanner in  =new Scanner(System.in);
        n=in.nextInt();

        while (n>0){
            bin[len++]=n%2;
            n/=2;
         }
        for (int i = len-1; i >=0 ; i--) {
            System.out.print(bin[i]);
        }
    }
}
/*
100
1100100
 */
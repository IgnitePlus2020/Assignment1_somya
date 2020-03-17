package com.tgt.igniteplus;

import java.util.Scanner;

//  print seq 1,5,13,29,49,77.... smaller than N
public class Seq16 {
    public static void main(String[]args){
        int n;

        Scanner in  =new Scanner(System.in);
        n=in.nextInt();
        seqFunc(n);
    }
    public  static void  seqFunc(int n){
        int i=1,j=1;
        while (i<=n){
            if (j%3!=0)
            {System.out.print(i+"\t");
            i=i+4*j;}
            j++;
        }
    }
}
/*
100
1	5	13	29	49	77
 */
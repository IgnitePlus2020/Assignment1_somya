package com.tgt.igniteplus;

import java.util.Scanner;

public class Seq15 {
    public static void main(String[]args){
        int n;

        Scanner in  =new Scanner(System.in);
        n=in.nextInt();
        seqFunc(n);
    }

    public  static void  seqFunc(int n){

        for (int i = 1; i <=n ; i++) {
            if(i==4)
                continue;
            System.out.print((i*i)+"\t");
        }
    }
}
/*
10
1	4	9	25	36	49	64	81	100
 */
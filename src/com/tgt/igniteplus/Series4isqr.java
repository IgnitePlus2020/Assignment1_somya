package com.tgt.igniteplus;

import java.util.Scanner;

public class Series4isqr {
    public static void main(String[]args){
        int n;
        Scanner in  =new Scanner(System.in);
        n=in.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.print(4*i*i);
            if (i<n)
                System.out.print(",");

        }

    }
}
/*
10
4,16,36,64,100,144,196,256,324,400
 */
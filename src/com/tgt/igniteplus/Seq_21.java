package com.tgt.igniteplus;

import java.util.Scanner;
/*
    first term=1
    for i :0 to n
        (-1)^i*(prev +i^2)
 */
public class Seq_21 {
    public  static  void  main(String[] args){
        int n;

        Scanner in  =new Scanner(System.in);
        n=in.nextInt();
        seqFunc(n);
    }
    static void seqFunc(int n){
        int prev=1;
        for (int i = 0; i <n ; i++) {
            prev=(prev+i*i);
            System.out.print((int)Math.pow(-1,i)*prev  +  ", "  );
        }
    }

}
/*
10
1, -2, 6, -15, 31, -56, 92, -141, 205, -286,
 */
package com.tgt.igniteplus;

import java.util.Scanner;

public class Seq_q12 {
    public  static  void  main(String args[])
    {
        int n;
        Scanner in  =new Scanner(System.in);
        n=in.nextInt();
        for (int i = 1; i <=n ; i++) {
            if(i%2==0)
              System.out.print(i);
        else
              System.out.print(-1*i);
        if (i<n)
              System.out.print(",");
        }
    }
}
/*
10
-1,2,-3,4,-5,6,-7,8,-9,10
 */
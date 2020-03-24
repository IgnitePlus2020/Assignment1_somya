package com.tgt.igniteplus;
/*
series 1
        prev+3
series
        prev-4

 */


import java.util.Scanner;

public class Seq_23 {
    public  static  void  main(String[] args){
        int n;

        Scanner in  =new Scanner(System.in);
        n=in.nextInt();
        seqFunc(n);
    }
        static void seqFunc(int n){
        int a=1,b=-2;
        if(n==0)
            return;

        System.out.print(a+","+b+",");
            for (int i = 2; i <n-2; i++) {
                if(i%2==0){
                    a=a+3;
                    System.out.print(a);
                }
                  else {
                    b=b-4;
                    System.out.print(b);
                }
                  if (i<n-3)
                      System.out.print(",");

            }
        }

    }

/*
15
1,-2,4,-6,7,-10,10,-14,13,-18,16,-22,19
 */
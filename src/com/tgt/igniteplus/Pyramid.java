package com.tgt.igniteplus;

import java.util.Scanner;

public class Pyramid {
    public  static void main(String args[]){
        int n,size;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        size=n;


        while(n-->0)
        {   int i=n,j=0;
            for(;i>0;i--)
                System.out.print(" ");
            for( ;j<size-n;j++)
                System.out.print("* ");
            System.out.println();

        }

    }

}

/*
OUTPUT :
5
    *
   * *
  * * *
 * * * *
* * * * *

 */
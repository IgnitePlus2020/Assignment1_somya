package com.tgt.igniteplus;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;
import java.util.Scanner;

public class max2num {
    public  static  void main(String [] args){
        Scanner in=new Scanner(System.in);
        int num[]=new int[3];
        System.out.println("enter three numbers : ");
        for (int i = 0; i <3 ; i++) {
            num[i]=in.nextInt();
        }
        Arrays.sort(num);
        System.out.println("max : "+num[2]+" second max : "+num[1]);

    }
}
/*
enter three numbers :
0
-4333
32434
max : 32434 second max : 0 min : -4333
 */
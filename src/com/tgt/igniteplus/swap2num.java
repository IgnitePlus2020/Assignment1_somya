package com.tgt.igniteplus;

import java.util.Scanner;

public class swap2num {
    public  static  void main(String args[]){
        int a,b;
        Scanner in =new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("numbers before swap a : "+a+"\tb : "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("numbers after swap  a : "+a+"\tb : "+b);
    }
}
/*
18383
45465
numbers before swap a : 18383	b : 45465
numbers after swap  a : 45465	b : 18383

 */
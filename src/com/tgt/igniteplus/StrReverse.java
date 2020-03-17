package com.tgt.igniteplus;
// prog to reverse a string
import java.util.Scanner;

public class StrReverse {
    public  static  void  main(String [] args ){

        String str;
        char temp;

        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        int strlen=str.length();

        char[] charArray=str.toCharArray();
        for (int i = 0; i <(strlen/2) ; i++) {
            temp=charArray[i];
            charArray[i]=charArray[strlen-i-1];
            charArray[strlen-i-1]=temp;

        }
        System.out.print(charArray);
    }

}

/*
Target
tegraT
 */
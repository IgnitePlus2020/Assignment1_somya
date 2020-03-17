package com.tgt.igniteplus;

import java.util.Scanner;
//to check if a given string is a palindrom
public class PalindromeCheck {
    public  static  void main(String[] a){
        Boolean palindrome=true;
        String str;
        System.out.println("enter a string");
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        int strlen=str.length();
        for (int i = 0; i <strlen-1; i++) {
            if(str.charAt(i)!=str.charAt(strlen-i-1))
                palindrome=false;
            break;
        }
        if(palindrome)
            System.out.print(str+" is palindrome");
        else System.out.print(str+" is not a a  palindrome");
            }
}
/*
enter a string
abcd
abcd is not a a  palindrome
***********************************
enter a string
abc
abc is not a a  palindrome
**********************************
enter a string
abccba
abccba is palindrome

 */
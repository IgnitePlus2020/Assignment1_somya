package com.tgt.igniteplus;

import java.util.Scanner;
//given a number display it in words
public class SpellNum {
    public  static  void main(String[] args){
        int n=0;

        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        char[] numberStr= String.valueOf(n).toCharArray();
        for (char c:numberStr){
           switch(c){
               case '0':System.out.print("zero ");
                        break;
               case '1':System.out.print("one ");
                        break;
               case '2':System.out.print("two ");
                        break;
               case '3':System.out.print("three ");
                        break;
               case '4':System.out.print("four ");
                        break;
               case '5':System.out.print("five ");
                        break;
               case '6':System.out.print("six ");
                        break;
               case '7':System.out.print("seven ");
                        break;
               case '8':System.out.print("eight ");
                        break;
               case '9':System.out.print("nine ");
                   break;
           }

        }

    }
}
/*
1234567890
one two three four five six seven eight nine zero
 */
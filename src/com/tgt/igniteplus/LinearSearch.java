package com.tgt.igniteplus;

import java.util.Scanner;

public class LinearSearch {
    public static void  main(String []args){
        //Driver code
        int[] a=new  int[100000];
        int n;
        Scanner in=new Scanner(System.in);

        System.out.print("length of array : ");
        n=in.nextInt();

        System.out.println("enter array elements : ");
        for (int i = 0; i <n ; i++) a[i] = in.nextInt();

        System.out.println("enter element to be searched : ");
        int key=in.nextInt();
        //function call
        int index=linearSearch(a,n,key);

            if(index>=0){
                System.out.print(key+ " found at pos : "+(index+1));
            }
            else System.out.print(key+ " not found");
    }

    //linear search func
    private static int linearSearch(int[] a, int n, int key) {
        for (int i = 0; i <n ; i++) {
            if(a[i]==key)
                return i;
        }
        return -1;
    }
}
/*
length of array : 5
enter array elements :
55
-656
0
54
776
enter element to be searched : 0
0 found at pos : 3
********************************************
length of array : 5
enter array elements :
1
2
3
4
5
enter element to be searched :
9
9 not found
 */
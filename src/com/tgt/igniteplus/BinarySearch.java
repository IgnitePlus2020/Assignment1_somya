package com.tgt.igniteplus;

import java.util.Scanner;

public class BinarySearch {

    public static void  main(String []args){
        //Driver code
        int[] a=new  int[100000];
        int n;
        Scanner in=new Scanner(System.in);

        System.out.print("length of array : ");
        n=in.nextInt();

        System.out.println("enter elements in ascending order: ");
        for (int i = 0; i <n ; i++) a[i] = in.nextInt();

        System.out.println("enter element to be searched : ");
        int key=in.nextInt();

        //function call
        int index=binarySearch(a,n,key);

        if(index>=0){
            System.out.print(key+ " found at pos : "+(index+1));
        }
        else System.out.print(key+ " not found");
    }

    //linear search func
    private static int binarySearch(int[] a, int n, int key) {
      int l=0,r=n-1,mid;
      while (l<r){
          mid=(l+r)/2;
          if(a[mid]==key)
              return mid;
          if(a[mid]<key)
              l=mid+1;
          else r=mid-1;
      }
      return -1;

    }
}
/*
length of array : 5
enter elements in ascending order:
23
56
78
99
103
enter element to be searched :
78
78 found at pos : 3
***************************************************************

length of array : 5
enter elements in ascending order:
1
5
8
99
100
enter element to be searched :
44
44 not found
 */
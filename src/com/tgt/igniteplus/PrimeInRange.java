package com.tgt.igniteplus;
import java.util.Scanner;

//prime number in range m-n

public class PrimeInRange {
    public  static  void  main(String[] args ){
        int m,n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the range ");
        m=in.nextInt();
        n=in.nextInt();

        for (int i=m;i<n;i++){
            if (prime(i)){
                System.out.print(i+"\t");
            }
        }
    }
    public  static boolean prime (int num){
        if (num==1)
            return false;
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if(num%i==0)
                return false;
        }
        return  true;
    }
}
/*
enter the range
1
100
2	3	5	7	11	13	17	19	23	29	31	37	41	43	47	53	59	61	67	71	73	79	83	89	97
 */
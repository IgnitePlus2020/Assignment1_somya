package com.tgt.igniteplus;
import java.math.BigInteger;
import java.util.Scanner;
//series printing i^i
public class NumPowNum {
    public  static  void  main(String args[]) {

        int n;
        Scanner in  =new Scanner(System.in);
        n=in.nextInt();

        for (int i = 1; i <=n ; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            System.out.print(i+":\t"+bigInteger.pow(i)+",\n");

        }
    }
}
/*
19
1:	1,
2:	4,
3:	27,
4:	256,
5:	3125,
6:	46656,
7:	823543,
8:	16777216,
9:	387420489,
10:	10000000000,
11:	285311670611,
12:	8916100448256,
13:	302875106592253,
14:	11112006825558016,
15:	437893890380859375,
16:	18446744073709551616,
17:	827240261886336764177,
18:	39346408075296537575424,
19:	1978419655660313589123979,
 */
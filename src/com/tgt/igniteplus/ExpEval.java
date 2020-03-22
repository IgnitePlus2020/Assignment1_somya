package com.tgt.igniteplus;
import  java.util.Stack;
import java.util.*;
/*
if :    token is operand
           push into val stack
if  :   token is (
            push into op stack
if  :   token is an operator
            while op on top of op stack has > or = precedence
                pop two from val ,pop 1 from op -->evaluate ---->push res into val stack
if  :   token is )
            while op on top of stack != (
                 pop two from val ,pop 1 from op -->evaluate ---->push res into val stack
            pop ( from top
 */

public class ExpEval {
    static int precedence(char op){
        if(op =='*' || op =='/') return 2;
        else if (op =='+' || op =='-')  return 1;
        else return 0;

    }
    static int applyOp(char op,int b,int a){
        int res=0;
        switch(op){
                    case '+':   res= a+b;
                                break;
                    case '-':   res= a-b;
                                break;
                    case '*':   res= a*b;
                                break;
                    case '/':   try {
                                        res=a/b;
                                    }
                                        catch (ArithmeticException e){
                                        System.out.print(e);
                                     }
                }
        return res;
    }
    static int eval(String exp){

        //change Strin gof token to cahr array
        char[] token=   exp.toCharArray();

        //create stack for val and op
        Stack<Integer> val=new Stack<Integer>();

        //create stack for val and op
        Stack<Character> op=new Stack<Character>();

        //trace the token array
        for (int i = 0; i <token.length ; i++) {
            System.out.println("\n\n"+i+")\t" + token[i]);


            //if token is a number push it into val stack
            if(token[i]>='0' && token[i]<='9' ) {
                int num=0;
                    while (i<token.length && token[i]>='0' && token[i]<='9') {
                        num *= 10;
                        num += token[i++] - '0';
                    }
                    //System.out.print("************"+num);
                    val.push(num);

i--;
                }
            //if token is (
            else if (token[i] == '(')
            {
                op.push(token[i]);
            }


                //if token is ')'
            else if(token[i]==')' ){
                while (op.peek()!='(')   val.push( applyOp(op.pop(),val.pop(),val.pop()) );
                op.pop();
            }


            else if (token[i]=='*' ||token[i]=='/' ||token[i]=='+' ||token[i]=='-' ){
                while (!op.empty()&&precedence(token[i]) <= precedence(op.peek()))   val.push( applyOp(op.pop(),val.pop(),val.pop()) );
                op.push(token[i]);

            }


            System.out.print("op-------->"+op+"\t\t");
            System.out.println("val-------->"+val);

        }

        //apply operator on values in val until op is empty
        while (!op.empty())
            val.push(applyOp(op.pop(), val.pop(), val.pop()));
        return val.pop();

    }

    public static void main(String [] args){

        String exp;

        System.out.print("enter the expression");
        Scanner in =new Scanner(System.in);
        exp =in.nextLine();
        System.out.print(eval(exp));

    }
}
/*
enter the expression5+5+(2*4)-(2/2)
5+5+(2*4)-(2/2)


****** 0)5 ********
op-------->[]		val-------->[5]


****** 1)+ ********
op-------->[+]		val-------->[5]


****** 2)5 ********
op-------->[+]		val-------->[5, 5]


****** 3)+ ********
op-------->[+]		val-------->[10]


****** 4)( ********
-------------(---------------
op-------->[+, (]		val-------->[10]


****** 5)2 ********
op-------->[+, (]		val-------->[10, 2]


****** 6)* ********
op-------->[+, (, *]		val-------->[10, 2]


****** 7)4 ********
op-------->[+, (, *]		val-------->[10, 2, 4]


****** 8)) ********
op-------->[+]		val-------->[10, 8]


****** 9)- ********
op-------->[-]		val-------->[18]


****** 10)( ********
-------------(---------------
op-------->[-, (]		val-------->[18]


****** 11)2 ********
op-------->[-, (]		val-------->[18, 2]


****** 12)/ ********
op-------->[-, (, /]		val-------->[18, 2]


****** 13)2 ********
op-------->[-, (, /]		val-------->[18, 2, 2]


****** 14)) ********
op-------->[-]		val-------->[18, 1]
17
 */
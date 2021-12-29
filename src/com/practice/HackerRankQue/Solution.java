package com.practice.HackerRankQue;


import java.util.Stack;

class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
       Stack<Integer> stack=new Stack<>();
       char ch[]=S.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
           if(ch[i]>=0 && ch[i]<=9)
           {
                stack.push(ch[i]-'0');
           }
           else 
           {
               int a =stack.pop();
               int b=stack.pop();
               
               switch(ch[i])
               {
                   case '+':
                      stack.push(a+b);
                   case '-':
                       stack.push(a-b);
                   case '*':
                       stack.push(a*b);
                   case '/':
                       stack.push(a/b);
                        
               }
               
           }
           
          
               
           
           
       }
       
       return stack.peek();
           
    
    }
}
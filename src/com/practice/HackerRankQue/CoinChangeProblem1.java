package com.practice.HackerRankQue;

import java.util.Scanner;

public class CoinChangeProblem1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		for(int i=0;i<input;i++)
		{
		    int num=scan.nextInt();
		    int coins[]=new int[num];
		    for(int j=0;j<coins.length;j++)
		        coins[j]=scan.nextInt();
		    int amount=scan.nextInt();
		    int arr[][]=new int[coins.length+1][amount+1];
		    for(int k=0;k<=coins.length;k++)
		    {
		        arr[k][0]=1;
		    }
		    for(int l=1;l<=amount;l++)
		    {
		        arr[0][l]=0;
		    }
		    for(int m=1;m<=coins.length;m++)
		    {
		        for(int n=1;n<=amount;n++)
		        {
		            if(coins[m-1]<=n)
		            {
		                arr[m][n]=arr[m-1][n]+arr[m][n-coins[m-1]];
		            }
		          else
		          {
		              arr[m][n]=arr[m-1][n];
		          }
		            
		        }
		    }
		    System.out.println(arr[coins.length][amount]);
		}

	}

}

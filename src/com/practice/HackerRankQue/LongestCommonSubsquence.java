package com.practice.HackerRankQue;

public class LongestCommonSubsquence {

	public static int max(int a ,int b)
	{
		return a>b?a:b;
	}
	
	public static void main(String[] args) {
		String s="abcdefg";
		String s1="abxdfg";
		char x[]=s.toCharArray();
		char y[]=s1.toCharArray();
		int m=x.length;
		int n=y.length;
		int lcs[][]=new int[m+1][n+1];
		
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0)
					lcs[i][j]=0;
				else if(x[i-1]==y[j-1])
					lcs[i][j]=lcs[i-1][j-1]+1;
				else
					lcs[i][j]=max(lcs[i-1][j],lcs[i][j-1]);
					
			}
		}
		System.out.println(lcs[m][n]);
		
		

	}

}

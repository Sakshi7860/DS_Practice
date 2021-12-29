package com.practice.HackerRankQue;

public class RotatedArray {

	public static void main(String[] args) {
		int matrix[][]= {{1, 2, 3},
	              {4, 5, 6},
	              {7, 8, 9}};
		int n=3;
		int result[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                result[i][j]=matrix[i][j];
            }
        }
        //rotate 90 degree Anti-clockwise direction
		
		for (int i = 0, k = n - 1; i < n && k >= 0; i++, k--) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = result[j][k];
			}
		}
		 
        
        //rotate 90degree clockwise direction
		/*
		 * for(int i=0;i<n;i++) { for(int j=0,k=n-1;j<n&&k>=0;j++,k--) {
		 * matrix[i][j]=result[k][i];
		 * 
		 * } }
		 */
        for(int l=0;l<matrix.length;l++)
        {
        	for(int m=0;m<matrix.length;m++)
        	{
        	System.out.println(matrix[l][m]);
        }
        }
		
		

	

}
}

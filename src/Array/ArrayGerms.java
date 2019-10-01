package Array;

import java.util.Scanner;

public class ArrayGerms {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int input=scan.nextInt();
	        for(int i=0;i<input;i++){
	            int m=scan.nextInt();
	            int n=scan.nextInt();
	            char arr[][]=new char[m][n];
	            scan.nextLine();
	            for(int i1=0;i1<m;i1++)
	            {
	            	  char c[]=scan.nextLine().toCharArray();
	            for(int j=0;j<n;j++)
	            {
	            	arr[i1][j]=c[i1];
	            }
	          }
	      System.out.println(arr[0][0]+" "+arr[0][1]+" "+arr[1][0]+" "+arr[1][1]);
	}

}
}
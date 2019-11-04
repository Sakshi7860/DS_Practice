package com.practice.HackerRankQue;

public class TowerOfHonaiProblemRecursion {
	
	public void swap(int n, char startRod, char auxRod, char finalRod)
	{
		if(n==1)
		{
			System.out.println("plate 1 from "+startRod+" to "+finalRod);
			return;
		}
		swap(n-1, startRod, finalRod, auxRod);
		System.out.println("plate "+ n +" from "+startRod+" to "+finalRod);
		swap(n-1, auxRod, startRod,finalRod);
	}

	public static void main(String[] args) {
		TowerOfHonaiProblemRecursion tc=new TowerOfHonaiProblemRecursion();
		tc.swap(3, 'A', 'B', 'C');

	}

}

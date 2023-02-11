package generalDSA;

import java.util.Arrays;
import java.util.Scanner;

public class FIbonacci
{

	
	public static int fib(int n)
	{
		if(n==0) return 0;
		if(n==1) return 1;
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int dp[]= new int[n];
		Arrays.fill(dp,-1);
		System.out.println(Arrays.toString(dp));
		System.out.println(fib(n));
		scn.close();
	}

}

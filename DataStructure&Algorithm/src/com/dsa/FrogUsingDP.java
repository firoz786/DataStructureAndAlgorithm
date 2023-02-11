package com.dsa;

import java.util.Arrays;

public class FrogUsingDP
{
	static int[] arr= {10,30,40,10,20,25,10,30};
	static int[] dp= new int[8];
	static int cost = Integer.MAX_VALUE;
	public static int fun(int i)
	{
		if (i==0) return 0;
		if(dp[i] !=-1 ) return dp[i];
		//1st way 
		cost= Math.min(cost,fun(i-1)+Math.abs(arr[i]-arr[i-1]));
		//2nd Jump
		if(i>1)
		cost= Math.min(cost,fun(i-2)+Math.abs(arr[i]-arr[i-2]));
		
		return dp[i]=cost;
	}

	public static void main(String[] args)
	{ 
		int n=6;
		Arrays.fill(dp,-1);
		System.out.println(fun(n));
	}

}

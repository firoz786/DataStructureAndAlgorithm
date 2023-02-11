package generalDSA;

import java.util.Scanner;
public class Frog1
{
	public static int minHeightCost(int noOfStones, int[] stonesHeight)
	{
		int sumOfJumpCost = 0;
		int i=0;
		while(i < noOfStones-2)
		{
			int fstJump = Math.abs(stonesHeight[i+1]-stonesHeight[i]);
			int sndJump = Math.abs(stonesHeight[i+2]-stonesHeight[i]);
			
			if(fstJump>sndJump)
			{
				System.out.println("Jump from "+i+" to "+(i+2));
				sumOfJumpCost += sndJump;
				i+=2;
			}
			else
			{
				System.out.println("Jump from "+i+" to "+(i+1));
				sumOfJumpCost += fstJump;
				i+=1;
			}
		}
		return sumOfJumpCost;
	}

	public static void main(String[] args)
	{
		// Taking inputs
		Scanner scn = new Scanner(System.in);
		int noOfStones = scn.nextInt();

		int[] stonesHeight = new int[noOfStones];

		for (int i = 0; i < noOfStones; i++)
		{
			stonesHeight[i] = scn.nextInt();
		}
		scn.close();

		// code
		System.out.println(minHeightCost(noOfStones, stonesHeight));
	

	}
}
/*
4
10
30
40
20
*/
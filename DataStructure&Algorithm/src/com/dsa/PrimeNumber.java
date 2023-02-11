package com.dsa;
import java.util.*;

public class PrimeNumber {
//concept : need to run the loop till squareroot of the number 
//concept : as soon as you get the first divisor , break the loop 
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int temp = 0; temp < t; temp++) {

			int num = scn.nextInt();
			int count = 0;
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.println("prime");
			else
				System.out.println("not prime");

		}
		scn.close();
	}
}
package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Account {

	static int i;

	public static void main(String[] args) {
		List<Integer> weights = Arrays.asList(4, 8, 5, 9);
		System.out.println(getWeight(weights, 20));
	}

	public static int getWeight(List<Integer> weights, int maxCapacity) {
		List<Integer> weights1 = weights.stream().sorted().collect(Collectors.toList());
		System.out.println(weights1);
		int sum = 0;
		for (i = 0; i < weights.size(); i++) {

			sum = sum + weights.get(i);
			if (sum > maxCapacity) {
				sum = sum - weights.get(i);
				break;
			}
			System.out.println(sum);

		}

		return sum;

	}

}
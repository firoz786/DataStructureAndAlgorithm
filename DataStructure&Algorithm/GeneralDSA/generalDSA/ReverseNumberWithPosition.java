package generalDSA;

import java.util.*;

public class ReverseNumberWithPosition {

	public static void main(String[] args) {
		// write your code here
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int revNum = 0;
			int count = 0;
			int temp = n;
			while (temp > 0) {
				temp = temp / 10;
				count++;
			}

			for (int i = 1; i <= count; i++) {
				int lastDigit = n % 10;
				revNum = revNum + i * (int) Math.pow(10, lastDigit - 1);
				n = n / 10;
			}
			System.out.println(revNum);

		}
	}
}

// Sample Input

// 28346751

// Sample Output
// 73425681
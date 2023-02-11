package generalDSA;
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		//my approach
//		int first = 0;
//		int second = 1;
//		int third;
//		int i = 1;
//
//		while (i <= n) {
//
//			if (i == 1)
//				System.out.println(first);
//			else if (i == 2)
//				System.out.println(second);
//			else {
//				third = first + second;
//				System.out.println(third);
//				first = second;
//				second = third;
//			}
//			i++;
//		}
		
		
		//EXpert Approach
		int a=0,b=1,c;
		for(int i=0;i<n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		sc.close();
	}
}

// Sample Input

// 10

// Sample Output
// 0
// 1
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34
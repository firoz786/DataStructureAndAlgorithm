package generalDSA;
import java.util.*;

public class LCMandHCF {

	public static void main(String[] args) {
		// write your code here
// Sample Input

// 36
// 24

// Sample Output
// 12
// 72

//taking inputs
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		if (first > second) {
		} else {
			int temp = first;
			first = second;
			second = temp;
		}

// System.out.println("first: "+first+" second: "+second);
		int firstTemp = first;
		int secondTemp = second;
		int div = 1;
		int hcf = 1;
		while (div != 0) {
			div = firstTemp % secondTemp;
			firstTemp = secondTemp;
			hcf = secondTemp;
			secondTemp = div;

		}

		System.out.println(hcf);
		int LCM = (first * second) / hcf;
		System.out.println(LCM);
		sc.close();
	}
}
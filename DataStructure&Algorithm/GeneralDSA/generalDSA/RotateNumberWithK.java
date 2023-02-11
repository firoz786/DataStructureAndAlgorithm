package generalDSA;
import java.util.*;

public class RotateNumberWithK {

	public static void main(String[] args) {
		// write your code here
		// 562984
		// 2
		// output : 845629

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();// 12345678
		int rotate = sc.nextInt();// 3
		int temp = number;
		int count = 0;
		// digit count
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}

		// what if rotation is more the count of digit
		rotate = rotate % count; // suppose num= 12345 and roatate= 27 then rotate change to 2.

		// what if the rotation is negative
		if (rotate < 0) {
			rotate = count + rotate;
		}

		System.out.println("count=" + count);// 8
		// divide the count of digit in to parts
		int div = 1, mul = 1;
		for (int i = 1; i <= count; i++) {
			if (i <= rotate)
				div = div * 10;
			else
				mul = mul * 10;
		}
		System.out.println("mul=" + mul + " div=" + div);// mul=100000div=1000
		// seperate number in to part using div and mul and then add
		int rightPart = number % div;
		rightPart = rightPart * mul;
		int leftPart = number / div;

		System.out.println("rightPart=" + rightPart + " leftPart=" + leftPart);
		number = leftPart + rightPart;

		System.out.println(number);
		sc.close();
	}
}
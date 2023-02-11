package pattern;

public class DecimalToAnyBase
{

	public static void main(String[] args)
	{
		int n = 125;
		int base = 2;
		int rem;
		String str = "";
		while (n > 0)
		{
			rem = n % base;
			n /= base;
			str = rem + str;
		}
		System.out.println(str);
	}

}

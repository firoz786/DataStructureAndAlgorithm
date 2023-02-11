package level1;

public class Pattern_63
{
	public static void main(String[] args)
	{
		int n = 5;
		int sp = n / 2;
		int st = 1;
		int cval = 1;
		
		for (int i = 1; i <= n; i++) // how many times loop run
		{
			for (int j = 1; j <= sp; j++)// for space
			{
				System.out.print("\t");
			}
			int rval = cval;
			for (int j = 1; j <= st; j++) // for value
			{
				System.out.print(rval + "\t");
				if (j <= st / 2)
					rval++;
				else
					rval--;
			}
			if (i <= n / 2)
			{
				sp--;
				st += 2;
				cval++;
			} else
			{
				sp++;
				st -= 2;
				cval--;
			}
			System.out.println();
		}
	}
}

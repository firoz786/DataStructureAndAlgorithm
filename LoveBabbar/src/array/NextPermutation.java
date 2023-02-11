package array;

public class NextPermutation
{
	public static void main(String[] args)
	{
		String str = "abc";
		printAllPermutation(str, "");
	}

	//ssf= string so far
	private static void printAllPermutation(String str, String ssf)
	{
		if (str.length() == 0)
		{
			System.out.println(ssf);
		}
		for (int i = 0; i < str.length(); i++)
		{
			char fc = str.charAt(i);
			String left = str.substring(0, i);
			String right = str.substring(i + 1);
			String strt = left + right;
			printAllPermutation(strt, (ssf + fc));
		}
	}
}

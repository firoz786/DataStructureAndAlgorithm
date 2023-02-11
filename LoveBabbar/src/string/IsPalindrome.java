package string;

public class IsPalindrome
{

	public static void main(String[] args)
	{
		String s = "aba";
		System.out.println(isPalindrom(s));
	}

	private static boolean isPalindrom(String s)
	{
		int i=0;
		int j=s.length()-1;
		boolean bb= false;
		while(i<j)
			bb= (s.charAt(i++) != s.charAt(j--)) ? false:true;
		return bb;
	}

}

package string;
/*
 * 
Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
		
*/

public class ReverseString_1
{

	public static void main(String[] args)
	{
		String str =  "hello";
		 reverseString(str);// 1st way

		// 2nd Approach
		String str1 = "Firoz";
		reverseRecursively(str1);
	}

	private static void reverseRecursively(String str)
	{
		if (str.length() <= 1||str.length()==0)
			System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length() - 1));
			reverseRecursively(str.substring(0, str.length() - 1));
		}
	}

	private static void reverseString(String s)
	{
		char[] ch = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i <= j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		System.out.println(String.valueOf(ch));
	}
}

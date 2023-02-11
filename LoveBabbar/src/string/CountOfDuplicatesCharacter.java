package string;

import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicatesCharacter
{

	public static void main(String[] args)
	{
		String s = "geeksforgeeks";
		countChars(s);
	}

	private static void countChars(String s)
	{
		Map<Character, Integer> hash = new HashMap<>();
		for (int i = 0; i < s.length(); i++)
		{
			if (hash.containsKey(s.charAt(i)))
			{
				hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
			} else
				hash.put(s.charAt(i), 1);
		}

		for (java.util.Map.Entry<Character, Integer> temp : hash.entrySet())
		{
			if (temp.getValue() > 1)
				System.out.println(temp.getKey() + ", count " + temp);
		}

	}

}

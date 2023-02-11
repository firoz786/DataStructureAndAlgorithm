package dynamicProgramming;

import java.util.*;

public class FindAllAnagramsInString
{
	public static void findAnagrams(String s, String p)
	{
		// write your code here
		Map<Character, Integer> shash = new HashMap<>();
		Map<Character, Integer> phash = new HashMap<>();

		for (int i = 0; i < p.length(); i++)
		{
			shash.put(s.charAt(i), (shash.getOrDefault(s.charAt(i), 0) + 1));
			phash.put(p.charAt(i), (phash.getOrDefault(p.charAt(i), 0) + 1));
		}
		int j = p.length();
		int i = 0;
		int count = 0;
		List<Integer> list = new ArrayList<>();
		while (j < s.length())
		{
			if (shash.equals(phash))
			{
				count++;
				list.add(i);
			}

			char cha = s.charAt(j);
			char chr = s.charAt(j - p.length());
			shash.put(cha, shash.getOrDefault(cha, 0) + 1);

			if (shash.get(chr) == 1)
			{
				shash.remove(chr);
			} else
			{
				shash.put(chr, shash.get(chr) - 1);
			}

			i++;
			j++;

		}
		if (shash.equals(phash))
		{
			count++;
			list.add(i);
		}
		System.out.println(count);
		System.out.println(list);

	}

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String p = scn.next();
		findAnagrams(s, p);
		scn.close();
	}

}

/*
 * input: cbaebabacd abc
 */
//output:
//	2
//	0 6 
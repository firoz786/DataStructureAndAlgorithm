package vidyaSagarGreen;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		boolean status = false;

		Set<Integer> set = new HashSet<>();
		for (Integer integer : nums) {
			if (set.add(integer) == false)
				return true;
		}

		return status;
	}

	public static void main(String[] args) {
		int[] num = { 1, 23, 4 };
		containsDuplicate(num);

	}
}

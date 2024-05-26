import java.util.HashSet;

public class DuplicateInteger {
    public static void main(String args[])
    {
        int nums[] =new int[]{1, 2, 3, 3};
        hasDuplicate(nums);
        System.out.println(hasDuplicate(nums));
    }
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();

        for(Integer num:nums)
        {
            if(hashset.contains(num))
            {
                return true;
            }
            else
            {
                hashset.add(num);
            }
        }
        return false;
    }
}

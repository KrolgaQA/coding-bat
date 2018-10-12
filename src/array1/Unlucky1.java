package array1;

public class Unlucky1 {
    public boolean unlucky1(int[] nums) {
        if (nums.length >= 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                if ((i == 0 | i == 1 | i == nums.length - 2) && nums[i] == 1 & nums[i + 1] == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}

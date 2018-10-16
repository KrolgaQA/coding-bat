package array2;

public class Sum13 {
    public int sum13(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                if (i > 0 && nums[i - 1] != 13) {
                    count += nums[i];
                } else if (i == 0) {
                    count += nums[i];
                }
            }
        }

        return count;
    }
}

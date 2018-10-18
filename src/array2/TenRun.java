package array2;

public class TenRun {
    public int[] tenRun(int[] nums) {
        if (nums.length < 1) {
            return nums;
        }

        int mult = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (mult % 10 != 0) {
                mult = nums[i];
            }
            if (nums[i] % 10 == 0) {
                mult = nums[i];
            }
            nums[i] = mult;
        }
        return nums;
    }
}

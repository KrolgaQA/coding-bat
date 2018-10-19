package array2;

public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = arrMax(i, nums);
            }
        }
        return nums;
    }

    public int arrMax(int i, int[] nums) {
        int max = 0;
        for (int j = i; j < nums.length - 1; j++) {
            if (nums[j + 1] >= max && !(nums[j + 1] % 2 == 0)) {
                max = nums[j + 1];
            }
        }
        return max;
    }

}

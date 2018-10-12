package array1;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {

        if (nums[0] >= nums[2]) {
            int max = nums[0];
            for (int i = 0; i <= nums.length - 1; i++) {
                nums[i] = max;
            }
        } else if (nums[0] <= nums[2]) {
            int max = nums[2];
            for (int i = 0; i <= nums.length - 1; i++) {
                nums[i] = max;
            }


        }
        return nums;
    }

}

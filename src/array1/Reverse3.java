package array1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int f = 0;
        int l = 0;

        f = nums[0];
        l = nums[nums.length - 1];
        nums[nums.length - 1] = f;
        nums[0] = l;

        return nums;
    }
}

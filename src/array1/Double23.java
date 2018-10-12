package array1;

public class Double23 {
    public boolean double23(int[] nums) {
        if (nums.length >= 2 && nums[0] == nums[nums.length - 1] & (nums[0] == 2 | nums[0] == 3)) {
            return true;
        }
        return false;

    }
}

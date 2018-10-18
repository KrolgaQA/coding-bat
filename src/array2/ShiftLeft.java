package array2;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        int[]s = new int[nums.length];
        if(nums.length>=1) {
            for (int i = 1; i < nums.length; i++) {
                s[i-1] = nums[i];
            }s[nums.length-1] = nums[0];
        }
        return s;
    }
}

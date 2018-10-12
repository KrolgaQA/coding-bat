package array1;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int[] newS = new int[2];
        if (nums.length > 2) {
            if (nums.length % 2 == 0) {
                newS[0] = nums[nums.length / 2 - 1];
                newS[1] = nums[nums.length / 2];
            }
        }else newS = nums;
        return newS;
    }
}

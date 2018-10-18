package array2;

public class Has22 {
    public boolean has22(int[] nums) {
        boolean has22 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            has22 = has22 | (nums[i] == 2 & nums[i] == nums[i + 1]);
        }
        return has22;
    }
}

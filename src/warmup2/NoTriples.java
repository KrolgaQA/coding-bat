package warmup2;

public class NoTriples {
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int ind = nums[i];
            int a = nums[i] + 5;

            if (i + 2 < nums.length && (nums[i + 1] == (a) & Math.abs(nums[i + 2] - (ind - 1)) <= 2)) {
                return true;
            }
        }
        return false;
    }
}

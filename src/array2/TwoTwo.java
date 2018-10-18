package array2;

public class TwoTwo {
    public boolean twoTwo(int[] nums) {
        boolean isTwoAppears = true;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == 2) {
                if (nums[i - 1] == 2) {
                    isTwoAppears = true;
                } else isTwoAppears = false;
            } else if (nums[i] == 2) {
                isTwoAppears = false;
            }
        }
        return isTwoAppears;
    }
}

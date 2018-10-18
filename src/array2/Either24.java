package array2;

public class Either24 {
    public boolean either24(int[] nums) {
        boolean is2Pair = false;
        boolean is4Pair = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) is2Pair = true;
            if (nums[i] == 4 && nums[i + 1] == 4) is4Pair = true;
        }
        return (is2Pair != is4Pair);
    }
}

package array2;

public class haveThree {
    public boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 3) {
                if (i < nums.length - 1) {
                    if (!(nums[i + 1] == 3)) {
                        count++;
                    }
                } else count++;
            }
        }
        return count == 3;
    }
}

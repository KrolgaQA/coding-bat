package array2;

import java.util.Arrays;

public class Pre4 {
    public int[] pre4(int[] nums) {
        int end = 0;
        while(nums[end]!=4){
            end++;
        }
        int[] pre = Arrays.copyOfRange(nums, 0, end);
        return pre;
    }
}

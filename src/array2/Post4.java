package array2;

import java.util.Arrays;

public class Post4 {
    public int[] post4(int[] nums) {
        int lastFour = 0;
        boolean isFour = false;
        int[] postFour = new int[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==4){
                lastFour = i;
                isFour = true;
            }
        }

        if(isFour){
            postFour = Arrays.copyOfRange(nums, lastFour+1, nums.length);
        }return postFour;
    }
}

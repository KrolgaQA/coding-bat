package array2;

import java.util.Arrays;

public class SameEnds {
    public boolean sameEnds(int[] nums, int len) {
        int[] arr1 = Arrays.copyOfRange(nums, 0, len);
        int[] arr2 = Arrays.copyOfRange(nums, nums.length - len, nums.length);
        return Arrays.equals(arr1, arr2);

    }
}

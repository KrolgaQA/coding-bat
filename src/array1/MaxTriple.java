package array1;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int mid = nums[nums.length/2];
        int last = nums[nums.length-1];
        if (len >= 3 && (max < mid & mid > last)) {
            max = mid;
        } else if (len >= 3 && (max < last & last > mid)) {
            max = last;
        } else if (len == 2 && max < last) {
            max = last;
        }

        return max;
    }
}

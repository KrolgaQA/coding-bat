package array2;

public class Sum67 {
    public int sum67(int[] nums) {
        int count = 0;
        int a = 0;
        int b = 0;
        while (a <= nums.length - 1 && nums[a] != 6) {
            count += nums[a];
            a++;
        }
        if (nums.length - a != 0) {
            for (int j = a; j < nums.length; j++) {
                if (nums[j] == 7) {
                    b = j;
                }
            }
        }

        if (b > 0) {
            while (b + 1 < nums.length) {
                count += nums[b + 1];
                b++;
            }
        }
        return count;
        
        /// TODO: Make a method count ints if there are few sections of numbers starting with a 6 and extending to the next 7 in array
    }
}

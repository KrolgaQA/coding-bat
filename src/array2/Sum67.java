package array2;

public class Sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6) {
                sum = sum + nums[i];
            } else if (checkSection(i, nums) != 0) {
                i = checkSection(i, nums);
            }
        }
        return sum;
    }

    public int checkSection(int a, int[] nums) {
        int endOfSection = 0;
        for (int i = a; i < nums.length; i++) {
            if (nums[i] == 7) {
                endOfSection = i;
                break;
            }
        }
        return endOfSection;
    }
}

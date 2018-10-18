package array2;

public class Lacky13 {
    public boolean lucky13(int[] nums) {
        boolean has1 = true;
        boolean has3 = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                has1 = false;
            } else if (nums[i] == 3) {
                has3 = false;
            }
        }
        return has1 & has3;
    }
}

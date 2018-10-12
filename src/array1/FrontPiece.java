package array1;

public class FrontPiece {
    public int[] frontPiece(int[] nums) {
        int[] a = new int[0];
        if (nums.length > 1) {
            a = new int[2];
            for (int i = 0; i <= a.length - 1; i++) {
                a[i] = nums[i];
            }
        } else if (nums.length == 1) {
            a = new int[1];
            a[0] = nums[0];
        }
        return a;

    }
}

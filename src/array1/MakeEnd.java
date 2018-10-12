package array1;

public class MakeEnd {
    public int[] makeEnds(int[] nums) {
        int[] end = new int [2];
        end[0]=nums[0];
        end[1] = nums[nums.length-1];
        return end;

    }
}

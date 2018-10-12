package array1;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int[] newS = new int[nums.length*2];
        newS[newS.length-1]=nums[nums.length-1];
        return newS;

    }
}

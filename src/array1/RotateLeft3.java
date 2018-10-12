package array1;

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int l = 0;
        int r = 0;
        for(int i = 0;i<nums.length-1;i++){
            l=nums[i];
            r=nums[i+1];
            nums[i]=r;
            nums[i+1]=l;
        }
        return nums;


    }
}

package array1;

public class Sum2 {
    public int sum2(int[] nums) {
        if(nums.length>=2){
            return nums[0]+nums[1];
        }else if (nums.length==1){
            return nums[0]*2;
        }return 0;

    }
}

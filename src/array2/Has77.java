package array2;

public class Has77 {
    public boolean has77(int[] nums) {
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]==7&nums[i]==nums[i+1]){
                return true;
            }else if(nums.length-i>2&&nums[i]==7&nums[i]==nums[i+2]){
                return true;
            }
        }return false;
    }
}

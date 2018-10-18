package array2;

public class ModThree {
    public boolean modThree(int[] nums) {
        boolean isModThree = false;
        for (int i = 1; i <nums.length-1 ; i++) {
            if((nums[i-1]%2==0&nums[i]%2==0&nums[i+1]%2==0)|!(nums[i-1]%2==0)&!(nums[i]%2==0)&!(nums[i+1]%2==0)){
                isModThree = true;
            }
        }return isModThree;
    }
}

package array2;

public class Only14 {
    public boolean only14(int[] nums) {
        boolean isNot14 = true;
        for (int i = 0; i <nums.length ; i++) {
            if(!(nums[i] == 1 | nums[i] == 4)){
                isNot14 = false;
                break;
            }
        }return isNot14;
    }
}

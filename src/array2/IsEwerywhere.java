package array2;

public class IsEwerywhere {
    public boolean isEverywhere(int[] nums, int val) {
        boolean isValPair = true;
        for (int i = 0; i <nums.length-1 ; i++) {
            if(!(nums[i]==val|nums[i+1]==val)){
                isValPair = false;
                break;
            }
        }return isValPair;
    }
}

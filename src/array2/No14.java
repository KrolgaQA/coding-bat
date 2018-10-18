package array2;

public class No14 {
    public boolean no14(int[] nums) {
        boolean is1 = false;
        boolean is4 = false;

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==1){
                is1 = true;
            }else if(nums[i]==4){
                is4 = true;
            }

            if(is1&is4){
                break;
            }

        }return !(is1&is4);
    }
}

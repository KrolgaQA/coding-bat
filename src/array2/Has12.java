package array2;

public class Has12 {
    public boolean has12(int[] nums) {
        boolean oneSpotted = false;
        for(int i = 0; i < nums.length; i++)
        {
            if(oneSpotted)
            {
                if(nums[i] == 2)
                    return true;
            }
            else if(nums[i] == 1)
                oneSpotted = true;
        }
        return false;
    }
}

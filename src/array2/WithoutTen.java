package array2;

public class WithoutTen {
    public int[] withoutTen(int[] nums) {

        int[] arr = new int[nums.length];
        int p = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 10)
            {
                arr[p] = nums[i];
                p++;
            }
        }
        return arr;
    }

}

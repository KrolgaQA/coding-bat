package warmup2;

public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int nine : nums
                ) {
            if(nine==9){
                count++;
            }

        }return count;

    }
}

package array1;

public class MidThree {
    public int[] midThree(int[] nums) {
        int[] three = new int[3];
        for (int i=0; i<=three.length-1;i++){
            three[i] = nums[(nums.length-1)/2-1+i];
        }return three;

    }

}

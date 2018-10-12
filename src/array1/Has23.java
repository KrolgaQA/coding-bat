package array1;

public class Has23 {
    public boolean has23(int[] nums) {
        for (int in : nums) {
            if (in==2||in==3){
                return true;
            }

        }return false;

    }
}

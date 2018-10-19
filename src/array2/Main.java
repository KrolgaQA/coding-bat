package array2;

public class Main {
    public static void main(String[] args) {
//        Only14 sum67 = new Only14();
//        int[] a = {1, 1};
//        System.out.println(sum67.only14(a));

//        Post4 post4 = new Post4();
//        int arr[] = {1,2,3,4,5,6,7,4};
//        System.out.println(post4.post4(arr));

//        NotAlone notAlone = new NotAlone();
        ZeroFront zeroFront = new ZeroFront();
        int[] arr = {2,0,2,3,0,2,5,0};
        arr = zeroFront.zeroFront(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}

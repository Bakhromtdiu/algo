package FastAndSlowPointer;

public class MiddleOfArrayList {


    public static int middle(int[] arr) {
        int fast = 0, slow = 0;
        while (fast < arr.length) {
            fast = fast + 2;
            slow++;
        }
        return arr[slow-1];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6,7,8,9};
        int n = middle(arr);
        System.out.println(n);
    }
}

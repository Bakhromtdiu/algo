package FastAndSlowPointer;

public class isHappyNumber {

    public static int squareofNumber(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10) * (number % 10);
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(happy(28));
    }

    public static boolean happy(int num) {
        int slow = num;
        int fast = squareofNumber(num);
        while (slow != fast && fast != 1) {
            slow = squareofNumber(slow);
            fast = squareofNumber(squareofNumber(fast));
        }
        return fast == 1;
    }
}

public class FindBorrowCount {
    public static void main(String[] args) {
        int a = 233;
        int b = 400;
        int borrow = 0;
        while (b > 0) {
            int digitA = a % 10;
            int digitB = b % 10;
            if (digitA < digitB) {
                borrow++;
                a = a - 10;
            }
            a /= 10;
            b /= 10;
        }
        System.out.println(borrow);
    }
}
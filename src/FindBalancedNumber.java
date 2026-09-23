import java.util.*;

public class FindBalancedNumber {

    public static void main(String[] args) {
        String num = "1234006";

        if (num.length() % 2 == 0) {
            System.out.println("Not balanced number");
        } else {
            int mid = num.length() / 2;
            int left = 0;
            for (int i = 0; i < mid; i++) {
                left += num.charAt(i) - '0';
            }
            int right = 0;
            for (int i = mid + 1; i < num.length(); i++) {
                right += num.charAt(i) - '0';
            }
            if (left == right) {
                System.out.println("Balanced number");
            } else {
                System.out.println("Not balanced number");
            }
        }
    }
}
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative number");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Enter a positive Number");
        }else{
            int factorial = 1;
            for(int i=1;i<=n;i++){
                factorial *= i;
            }
            System.out.println("Factorial of "+ n + " is: " + factorial);
        }

    }
}

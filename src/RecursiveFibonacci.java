import java.util.*;
public class RecursiveFibonacci {
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Enter non-zero number");
        }else{
            int result = fibonacci(n);
            System.out.println("Fibnocci of: " + n + " is " + result);
        }
    }
}

import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a = sc.nextInt();
        System.out.print("Enter a number ");
        int b = sc.nextInt();
        System.out.println("1 Add");
        System.out.println("2 Sub");
        System.out.println("3 Mul");
        System.out.println("4 Div");
        System.out.print("Enter the operation:");
        int clac = sc.nextInt();
        double result;
        switch(clac){
            case 1:
                result = a+b;
                System.out.println(result);
                break;
            case 2:
                result = a-b;
                System.out.println(result);
                break;
            case 3:
                result = a*b;
                System.out.println(result);
                break;
            case 4:
                if (b != 0){
                    result = a/b;
                    System.out.println(result);
                } else{
                    System.out.println("Error the zero div is not allowed");
                }
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}

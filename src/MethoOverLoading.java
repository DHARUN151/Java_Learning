import java.util.*;
public class MethoOverLoading {
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("Sum of two numbers: " + add(2,4));
        System.out.println("Sum of two double numbers: " + add( 4.33, 5.22));
        System.out.println("Sum of three numbers: "+ add(2,3,4));
    }
}

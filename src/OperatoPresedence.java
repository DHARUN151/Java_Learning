import java.util.*;
public class OperatoPresedence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int expression = ((a*b) + (c/d) + (d+a) );
        System.out.println(expression);
    }
}

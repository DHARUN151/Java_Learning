import java.util.*;
public class FactorialRecusion {
    int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        FactorialRecusion f = new FactorialRecusion();
        System.out.println(f.fact(5));
    }
}

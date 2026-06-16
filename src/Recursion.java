import java.util.*;
public class Recursion {
    void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.print(5);
    }
}

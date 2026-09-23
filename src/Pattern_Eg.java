import java.util.*;
public class Pattern_Eg {
    public static void main(String args[]){
        pattern8(5);
    }

    static void pattern5(int n){
        for(int row = 0; row< 2 * n; row++) {
            int totalColsInRows = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row=1; row<=n; row++){
            for(int col=0; col<n - row + 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row =1; row<=n; row++){
            int space = n / row;

            for(int col=0; col < row; col++){
                System.out.print("* ");
            }
            for(int s=0; s < space; s++){
                System.out.print(" ");
            }
            for(int s=0; s < space; s++){
                System.out.print(" ");
            }
            for(int col=0; col < row; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int row =1; row<=n; row++){
            for(int sp = 0; sp<row; sp++) {
                System.out.print(" ");
            }
            for(int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

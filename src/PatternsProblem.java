public class PatternsProblem {
    public static void main(String[] args) {
        pattern10(5);
    }
    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=1; row<=n; row++){
            for(int col=row; col<=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=1; row<=2*n;row++){
            int totalCol = row>n ? 2*n-row : row;
            for(int col=1; col<=totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int row = 1; row<=n; row++){
            for(int col =1; col<=n-row; col++){
                System.out.print(" ");
            }

            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int row = n; row>=1; row--){
            for(int col =1; col<=n-row; col++){
                System.out.print(" ");
            }

            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=(2*row-1);col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int row=n; row>=1; row--){
            for(int col=1; col<=n-row; col++){
                System.out.print(" ");
            }
            for (int col=1; col<=(2*row-1);col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

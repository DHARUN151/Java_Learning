import java.util.*;
public class PatternProblem {
    public static void main(String[] args) {
//        int nums=0;
//        for( ; ; ){
//            System.out.print(nums++);
//        }
//        for(int i =1 ; i<20;i+=2){
//            System.out.println(i);
//        }
//        int i,j,k;
//        for(i=0, j=2, k=5; i<10; i++,j+=2,k+=5){
//            System.out.println(i + " " + k + " " +j);
//        }
//        int ans ;
//        int T=5;
//        int i;
//        for(i = 1;i<=10; i++){
//            ans = i*T;
//            System.out.println(i + " x " + T + " = " + (ans));
//        }
        int i,j;
        for(i=0;i<10;i++){
            for(j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class MoveHashFoward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        String symb = "";
        String alpha = "";
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '#'){
                symb = symb+ch;
            }else{
                alpha = alpha+ch;
            }
        }
        System.out.println(symb + alpha);
    }
}
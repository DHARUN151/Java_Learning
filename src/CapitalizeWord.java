import java.util.Scanner;

public class CapitalizeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        char ch = sc.next().charAt(0);
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ch){
                if(ch >= 'a' || ch <= 'z'){
                    res += (char) (str.charAt(i) - 32);
                }else{
                    res += (char)(str.charAt(i) + 32);
                }
            }else{
                res += str.charAt(i);
            }
        }
        System.out.println(res);
    }
}

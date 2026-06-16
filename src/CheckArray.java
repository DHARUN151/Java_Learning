import java.util.Scanner;

public class CheckArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String x = "java";
//        String y = "java";
//        System.out.println(x.equals(y));
//        String p = "java";
//        String q = "JAVA";
//        System.out.println(p.equalsIgnoreCase(q));
//        System.out.println(x.contains("java"));
//        System.out.println(x.startsWith("JAVA"));
//        System.out.println(y.endsWith("a"));
//
//        String str2 = "Programming";
//        System.out.println(str2.substring(3));
//        System.out.println(str2.trim());
//        System.out.println("/----Reverse String---/");
//        String original = "java";
//        String reverse = " ";
//        for(int i = original.length()-1; i>=0; i--){
//
//            reverse = reverse + original.charAt(i);
//        }
//        System.out.println("Reverse: " + reverse);

        System.out.println("/------Palindrome-----/");
        String word = "Dharun";
        String rev = "";
        for(int i=word.length()-1;i>=0;i--){
            rev += word.charAt(i);
        }
        System.out.println(rev);
        if(word.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}

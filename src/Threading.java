import java.util.*;
public class Threading {
    public static void main(String args[]){
        Thread t = new Thread("My first Thread");
        String str = t.getName();
        System.out.println(str);
    }
}

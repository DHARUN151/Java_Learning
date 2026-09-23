import java.util.*;
public class IndexFinding {
    public static void main(String[] args) {
        int[] arr = {8, 9, 8, 1, 3, 5};
        int value = arr[0];
        Arrays.sort(arr);
        int indexValue = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == value) {
                indexValue = i;
                break;
            }
        }
        System.out.println("sorting value: "+ Arrays.toString(arr));
        System.out.println("After sorting: " + indexValue);
    }
}

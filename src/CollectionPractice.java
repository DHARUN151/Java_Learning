import java.util.*;
public class CollectionPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(39);

        ArrayList<Integer> moreNum = new ArrayList<>();
        moreNum.add(44);
        moreNum.add(55);

        ArrayList<Integer> removeNum = new ArrayList<>();
        removeNum.remove(20);
        numbers.addAll(moreNum);
        System.out.println(numbers);

    }
}

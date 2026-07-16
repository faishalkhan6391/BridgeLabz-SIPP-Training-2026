import java.util.*;

public class Main {
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.println(n);
    }
// ques 1
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3);
        print(nums);
    }
}
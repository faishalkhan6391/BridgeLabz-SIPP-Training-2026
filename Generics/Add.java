import java.util.*;

public class Main {
    public static void add(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        add(list);
        System.out.println(list);
    }
}
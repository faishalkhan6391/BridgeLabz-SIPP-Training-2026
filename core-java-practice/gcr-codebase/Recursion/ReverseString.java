import java.util.*;

public class ReverseString {
    static void reverse(String str) {
        if (str.length() == 0)
            return;

        System.out.print(str.charAt(str.length() - 1));
        reverse(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
    }
}
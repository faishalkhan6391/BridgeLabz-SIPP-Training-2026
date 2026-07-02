import java.util.ArrayList;

public class TypeSafetyExample {

    public static void main(String[] args) {

        // Generic ArrayList stores only String values
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // languages.add(100); // Compile-time Error

        for (String language : languages) {
            System.out.println(language);
        }
    }
}
public class GenericMethodExample {

    // Generic Method
    public static <T> void display(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {

        display(100);          // Integer
        display("Java");       // String
        display(3.14);        // Double
    }  
}                                                     
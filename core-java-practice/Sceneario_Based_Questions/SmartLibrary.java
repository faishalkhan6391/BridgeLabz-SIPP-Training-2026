public class SmartLibrary {

    static String books[] = {"Java", "Python", null, "C++"};

    public static int getBookLength(int index) {
        try {
            return books[index].length();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid book index " + index);
            return -1;

        } catch (NullPointerException e) {
            System.out.println("Error: No book available at index " + index);
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println("Length: " + getBookLength(1)); // Python
        System.out.println("Length: " + getBookLength(2)); // null
        System.out.println("Length: " + getBookLength(5)); // invalid index
    }
}
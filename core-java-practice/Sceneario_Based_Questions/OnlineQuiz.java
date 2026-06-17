public class OnlineQuiz {

    public static void main(String[] args) {

        String answers[] = {"A", "B", "C", "D"};

        for (int i = 0; i <= 5; i++) {

            try {
                if (answers[i].equals("A")) {
                    System.out.println("Answer at index " + i + " is A");
                } else {
                    System.out.println("Answer at index " + i + " is not A");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid answer index: " + i);

            } catch (NullPointerException e) {
                System.out.println("Answer at index " + i + " is null");
            }
        }

        System.out.println("Checking completed.");
    }
}
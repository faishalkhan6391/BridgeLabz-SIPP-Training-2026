import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {
            System.out.print("\nEnter age (-1 to exit): ");
            int age = sc.nextInt();

            // Special code to stop voting
            if (age == -1) {
                break;
            }

            // Check eligibility
            if (age >= 18) {
                System.out.println("Eligible to vote.");

                System.out.println("Candidates:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                System.out.print("Enter your vote (1, 2, or 3): ");
                int vote = sc.nextInt();

                if (vote == 1) {
                    candidate1Votes++;
                    System.out.println("Vote recorded for Candidate A.");
                } else if (vote == 2) {
                    candidate2Votes++;
                    System.out.println("Vote recorded for Candidate B.");
                } else if (vote == 3) {
                    candidate3Votes++;
                    System.out.println("Vote recorded for Candidate C.");
                } else {
                    System.out.println("Invalid vote!");
                }

            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        // Display final results
        System.out.println("\n===== Election Results =====");
        System.out.println("Candidate A: " + candidate1Votes + " votes");
        System.out.println("Candidate B: " + candidate2Votes + " votes");
        System.out.println("Candidate C: " + candidate3Votes + " votes");

        sc.close();
    }
}
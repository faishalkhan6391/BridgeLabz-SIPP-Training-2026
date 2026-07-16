import java.util.Scanner;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double billAmount, double payment)
            throws InsufficientFundsException {

        if (payment < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // NumberFormatException
            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());

            // ArithmeticException (division by zero)
            double totalBill = 5000;
            double costPerItem = totalBill / items;

            System.out.println("Cost per item = " + costPerItem);

            // ArrayIndexOutOfBoundsException
            String[] patients = {"Amit", "Rahul", "Priya"};

            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient Name: " + patients[index]);

            // Custom Exception
            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            processPayment(totalBill, payment);

        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot be divided by zero items.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Billing process completed.");
            sc.close();
        }
    }
}
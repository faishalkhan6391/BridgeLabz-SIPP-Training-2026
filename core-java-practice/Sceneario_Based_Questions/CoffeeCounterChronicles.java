import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double GST_RATE = 0.18; // 18% GST

        while (true) {
            System.out.print("\nEnter coffee type (Espresso, Latte, Cappuccino) or 'exit': ");
            String coffeeType = sc.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Cafe Closed. Thank you!");
                break;
            }

            double price = 0;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 180;
                    break;

                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // consume newline

            double total = price * quantity;
            double gst = total * GST_RATE;
            double finalBill = total + gst;

            System.out.println("\n----- BILL -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Subtotal    : ₹" + total);
            System.out.println("GST (18%)   : ₹" + gst);
            System.out.println("Total Bill  : ₹" + finalBill);
        }

        sc.close();
    }
}
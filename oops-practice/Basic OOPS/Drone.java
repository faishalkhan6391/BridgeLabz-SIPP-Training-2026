class Drone {

    // Instance Variables
    String droneId;
    int batteryPercentage;

    // Static Variable
    static String companyName = "Sky Logistics";

    // Constructor
    Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    // Method to start delivery
    void startDelivery() {
        if (batteryPercentage > 20) {
            System.out.println(droneId + " started delivery.");
        } else {
            System.out.println(droneId + " cannot start delivery. Low battery!");
        }
    }

    // Method to display status
    void displayStatus() {
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("Company: " + companyName);
        System.out.println();
    }

    public static void main(String[] args) {

        Drone d1 = new Drone("D101", 80);
        Drone d2 = new Drone("D102", 50);
        Drone d3 = new Drone("D103", 15);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        System.out.println();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}
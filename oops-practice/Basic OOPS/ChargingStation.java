class ChargingStation {

    // Static Variables
    static int totalStations = 0;
    static double electricityRate = 8.5; // Rs per unit

    // Instance Variables
    String stationId;
    double unitsConsumed;

    // Constructor
    ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    // Calculate Bill
    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display Details
    void displayStationDetails() {
        System.out.println("Station ID      : " + stationId);
        System.out.println("Units Consumed  : " + unitsConsumed);
        System.out.println("Electricity Rate: ₹" + electricityRate);
        System.out.println("Bill Amount     : ₹" + calculateBill());
        System.out.println();
    }

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation("CS101", 120);
        ChargingStation s2 = new ChargingStation("CS102", 150);
        ChargingStation s3 = new ChargingStation("CS103", 180);
        ChargingStation s4 = new ChargingStation("CS104", 200);
        ChargingStation s5 = new ChargingStation("CS105", 250);

        System.out.println("----- Bills at Initial Rate -----");
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        // Change electricity rate
        ChargingStation.electricityRate = 10.0;

        System.out.println("----- Bills After Rate Change -----");
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations Created: " + ChargingStation.totalStations);
    }
}
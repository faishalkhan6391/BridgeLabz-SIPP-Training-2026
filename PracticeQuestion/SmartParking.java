import java.util.ArrayList;

public class SmartParking {

    ArrayList<String> parking = new ArrayList<>();

    // Add Vehicle
    public void addVehicle(String vehicleNo) {
        parking.add(vehicleNo);
        System.out.println(vehicleNo + " entered the parking.");
    }

    // Remove Vehicle
    public void removeVehicle(String vehicleNo) {
        if (parking.remove(vehicleNo)) {
            System.out.println(vehicleNo + " exited the parking.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    // Search Vehicle
    public void searchVehicle(String vehicleNo) {
        if (parking.contains(vehicleNo)) {
            System.out.println(vehicleNo + " is parked.");
        } else {
            System.out.println(vehicleNo + " is not parked.");
        }
    }

    // Display All Vehicles
    public void displayVehicles() {
        System.out.println("\nVehicles in Parking:");
        if (parking.isEmpty()) {
            System.out.println("Parking is empty.");
        } else {
            for (String vehicle : parking) {
                System.out.println(vehicle);
            }
        }
    }

    public static void main(String[] args) {

        SmartParking sp = new SmartParking();

        sp.addVehicle("UP32AB1234");
        sp.addVehicle("DL01CD5678");
        sp.addVehicle("MH12EF9876");

        sp.searchVehicle("DL01CD5678");

        sp.removeVehicle("DL01CD5678");

        sp.displayVehicles();
    }
}
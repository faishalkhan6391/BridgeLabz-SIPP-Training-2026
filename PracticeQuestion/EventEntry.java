public import java.util.HashSet;

public class EventEntry {

    HashSet<String> participants = new HashSet<>();

    // Register Participant
    public void registerParticipant(String email) {
        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println("Duplicate registration! " + email + " already exists.");
        }
    }

    // Display Participants
    public void displayParticipants() {
        System.out.println("\nRegistered Participants:");
        for (String email : participants) {
            System.out.println(email);
        }
    }

    // Total Participants
    public void totalParticipants() {
        System.out.println("\nTotal Eligible Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        EventEntry event = new EventEntry();

        event.registerParticipant("john@gmail.com");
        event.registerParticipant("alice@gmail.com");
        event.registerParticipant("bob@gmail.com");

        // Duplicate Registration
        event.registerParticipant("alice@gmail.com");

        event.displayParticipants();

        event.totalParticipants();
    }
} {
    
}

import java.util.*;

public class AttendanceTracker {

    HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    // Mark Attendance
    public void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<String>());

        ArrayList<String> students = attendance.get(subject);

        if (students.contains(student)) {
            System.out.println(student + " is already marked present in " + subject);
        } else {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        }
    }

    // Display Attendance
    public void displayAttendance() {

        System.out.println("\nAttendance List:");

        for (String subject : attendance.keySet()) {

            System.out.println("\nSubject: " + subject);

            ArrayList<String> students = attendance.get(subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students: " + students.size());
        }
    }

    public static void main(String[] args) {

        AttendanceTracker at = new AttendanceTracker();

        at.markAttendance("Java", "Aman");
        at.markAttendance("Java", "Rahul");
        at.markAttendance("Python", "Priya");
        at.markAttendance("Python", "Aman");

        // Duplicate Attendance
        at.markAttendance("Java", "Aman");

        at.displayAttendance();
    }
}
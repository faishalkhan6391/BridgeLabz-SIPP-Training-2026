import java.util.Scanner;

public class EmployeeAttendanceRanking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] employeeIds = new int[n];
        int[] attendance = new int[n];

        for (int i = 0; i < n; i++) {
            employeeIds[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            attendance[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // Sort according to attendance (descending)
        // If attendance is same, smaller employee ID first

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (attendance[j] > attendance[maxIndex]) {
                    maxIndex = j;
                } else if (attendance[j] == attendance[maxIndex]
                        && employeeIds[j] < employeeIds[maxIndex]) {
                    maxIndex = j;
                }
            }

            int tempAttendance = attendance[i];
            attendance[i] = attendance[maxIndex];
            attendance[maxIndex] = tempAttendance;

            int tempId = employeeIds[i];
            employeeIds[i] = employeeIds[maxIndex];
            employeeIds[maxIndex] = tempId;
        }

        for (int i = 0; i < k; i++) {
            System.out.print(employeeIds[i] + " ");
        }
    }
}
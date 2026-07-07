import java.util.Scanner;

public class EmployeeSalaryMergeSort {

    // Merge Sort Function
    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge Function
    static void merge(int arr[], int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        // Copy data to left array
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        // Copy data to right array
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        // Merge the arrays
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int salaries[] = new int[n];

        System.out.println("Enter employee salaries:");

        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        mergeSort(salaries, 0, n - 1);

        System.out.println("Sorted Salaries:");

        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

        sc.close();
    }
}
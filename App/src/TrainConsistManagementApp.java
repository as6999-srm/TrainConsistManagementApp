import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Binary Search method
    public static boolean binarySearch(String[] bogieIds, String key) {
        int left = 0;
        int right = bogieIds.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // found
            } else if (comparison < 0) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC19: Binary Search for Bogie ID\n");

        // Unsorted bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // IMPORTANT: sort before binary search
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Perform binary search
        boolean found = binarySearch(bogieIds, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        scanner.close();
    }
}
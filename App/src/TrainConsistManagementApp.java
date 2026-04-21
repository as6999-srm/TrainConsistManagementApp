import java.util.Scanner;

public class TrainConsistManagementApp {

    // Linear Search with validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // 🔴 Fail-fast validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Search operation cannot proceed.");
        }

        // Perform search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC20: Exception Handling During Search\n");

        // Try both cases:
        // Case 1: Empty array (to trigger exception)
        // String[] bogieIds = {};

        // Case 2: Valid data
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie ID " + searchKey + " FOUND.");
            } else {
                System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
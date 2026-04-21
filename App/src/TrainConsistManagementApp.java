import java.util.Scanner;

public class TrainConsistManagementApp {

    // Linear Search method
    public static boolean linearSearch(String[] bogieIds, String key) {
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true; // match found
            }
        }
        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC18: Linear Search for Bogie ID\n");

        // Sample bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        scanner.close();
    }
}
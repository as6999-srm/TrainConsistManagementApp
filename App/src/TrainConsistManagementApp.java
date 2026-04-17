import java.util.Scanner;
import java.util.TreeSet;
import java.util.SortedSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // TreeSet maintains sorted order + uniqueness
        SortedSet<String> bogieIds = new TreeSet<>();

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC4: Maintain Ordered Bogie IDs (TreeSet)\n");

        while (true) {
            System.out.print("Enter Bogie ID (or type 'exit' to stop): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (!bogieIds.add(input)) {
                System.out.println("Error: Duplicate Bogie ID not allowed!");
            } else {
                System.out.println("Bogie ID added successfully.");
            }
        }

        System.out.println("\nSorted Bogie IDs (Train Order):");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        scanner.close();
    }
}
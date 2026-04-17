import java.util.HashSet;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<String> bogieIds = new HashSet<>();

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC3: Track Unique Bogie IDs");

        while (true) {
            System.out.print("Enter Bogie ID (or type 'exit' to stop): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (bogieIds.contains(input)) {
                System.out.println("Error: Duplicate Bogie ID not allowed!");
            } else {
                bogieIds.add(input);
                System.out.println("Bogie ID added successfully.");
            }
        }

        System.out.println("\nFinal Unique Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        scanner.close();
    }
}
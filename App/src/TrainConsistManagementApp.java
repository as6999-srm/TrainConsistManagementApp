import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC17: Sort Bogie Names Using Arrays.sort()\n");

        // Array of bogie names
        String[] bogieNames = {
                "Sleeper", "AC Chair", "First Class", "General", "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}
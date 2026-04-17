import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // HashMap to store bogie -> capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC6: Map Bogie to Capacity\n");

        // Adding bogie-capacity mappings
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 100);

        // Display bogie capacities
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

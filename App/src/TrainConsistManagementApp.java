import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC7: Sort Bogies by Capacity\n");

        // List to store bogies
        List<Bogie> bogies = new ArrayList<>();

        // Adding bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted sbogies
        System.out.println("Bogies Sorted by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}
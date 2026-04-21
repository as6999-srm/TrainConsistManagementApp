// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    String type;   // Rectangular, Cylindrical
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {
        try {
            // Rule: Rectangular cannot carry Petroleum
            if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully to " + type + " bogie: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed for " + type + " bogie.\n");
        }
    }

    public String toString() {
        return type + " -> " + (cargo != null ? cargo : "No Cargo");
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC15: Safe Cargo Assignment Using try-catch-finally\n");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        // Another valid assignment to show program continues
        b2.assignCargo("Coal");

        // Final state
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);
    }
}
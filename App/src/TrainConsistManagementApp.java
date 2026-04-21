public class TrainConsistManagementApp {

    // Bubble Sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Optimization: track if swap happens
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps → already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC16: Bubble Sort for Bogie Capacities\n");

        // Example capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // Apply Bubble Sort
        bubbleSort(capacities);

        System.out.println("\n\nAfter Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}
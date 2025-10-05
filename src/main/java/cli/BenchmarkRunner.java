package cli;

import algorithms.SelectionSort;
import metrics.PerformanceTracker;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int n = 1000;
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Using default size 1000.");
            }
        }

        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100000);
        }

        PerformanceTracker tracker = new PerformanceTracker();
        tracker.start();
        SelectionSort.sort(arr, tracker);
        tracker.stop();

        System.out.println("=== Selection Sort Benchmark ===");
        System.out.println("Array size: " + n);
        System.out.println("Comparisons: " + tracker.comparisons);
        System.out.println("Swaps: " + tracker.swaps);
        System.out.println("Execution time (ms): " + tracker.getDurationNs() / 1_000_000.0);
    }
}

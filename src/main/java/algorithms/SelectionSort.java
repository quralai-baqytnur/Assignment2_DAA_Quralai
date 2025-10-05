package algorithms;

import metrics.PerformanceTracker;

public class SelectionSort {

    public static void sort(int[] arr, PerformanceTracker tracker) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                tracker.comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex == i) continue;

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            tracker.swaps++;
        }
    }
}

package algorithms;

import metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    @Test
    void testSimpleArray() {
        int[] arr = {5, 2, 9, 1, 3};
        int[] expected = {1, 2, 3, 5, 9};
        PerformanceTracker tracker = new PerformanceTracker();
        SelectionSort.sort(arr, tracker);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        PerformanceTracker tracker = new PerformanceTracker();
        SelectionSort.sort(arr, tracker);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        PerformanceTracker tracker = new PerformanceTracker();
        SelectionSort.sort(arr, tracker);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        PerformanceTracker tracker = new PerformanceTracker();
        SelectionSort.sort(arr, tracker);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {3, 5, 3, 1, 5};
        int[] expected = {1, 3, 3, 5, 5};
        PerformanceTracker tracker = new PerformanceTracker();
        SelectionSort.sort(arr, tracker);
        assertArrayEquals(expected, arr);
    }
}

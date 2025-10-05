package metrics;

public class PerformanceTracker {
    public long comparisons = 0;
    public long swaps = 0;
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public long getDurationNs() {
        return endTime - startTime;
    }

    public void reset() {
        comparisons = 0;
        swaps = 0;
    }
}

import java.util.*;
class MergeIntervals {
    public static int[][] mergeIntervals(int intervals[][]) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int intervals[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int res[][] = mergeIntervals(intervals);
        for (int i = 0; i < res.length; i++) {
            System.out.print("[");
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + ",");
            }
            System.out.print("]");
        }
    }
}
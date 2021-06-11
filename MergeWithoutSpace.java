import java.util.*;

public class MergeWithoutSpace {

    public static int nextGap(int n) {
        if (n <= 1) {
            return 0;
        }
        return (n % 2) + (n / 2);
    }

    public static void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int gap = n + m, i, j;
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            // swapping in first arr
            for (i = 0; i + gap < n; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }
            // swapping in both array
            for (j = gap > n ? gap - n : 0; i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
            // swapping in second arr
            if (j < m) {
                for (j = 0; j + gap < m; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                }

            }
        }

    }

    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 5, 9, 10, 15, 20 };
        int arr2[] = new int[] { 2, 3, 8, 13 };

        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.print("After Merging nFirst Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(arr2));
    }
}


/**
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
 */
import java.util.*;

class MoveAllNegEles {
    public static void moveNegelements(int arr[]) {
        Queue<Integer> negStack = new LinkedList<>();
        for (int i : arr) {
            if (i < 0) {
                negStack.offer(i);
            }
        }
        while (!negStack.isEmpty()) {
            System.out.print(negStack.poll() + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
        //moveNegelements(arr);

    }
}
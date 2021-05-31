import java.util.*;

public class MinMaxEle {
    public static int getMinValue(int arr[], int val, int n) {
        if (n == 1) {
            return arr[0];
        }
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < val) {
                val = arr[i];
            }

        }
        return val;
    }

    public static int getMaxValue(int arr[], int val, int n) {
        if (n == 1) {
            return arr[0];
        }
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > val) {
                val = arr[i];
            }

        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            System.out.println("min val is " + getMinValue(arr, Integer.MAX_VALUE, n));
            System.out.println("max val is " + getMaxValue(arr, Integer.MIN_VALUE, n));
        } catch (NegativeArraySizeException e) {
            System.out.println("please enter positive size!");
        }

    }

}

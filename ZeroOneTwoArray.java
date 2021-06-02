import java.util.*;

public class ZeroOneTwoArray {
    public static void getArray(int arr[], int p) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        if (p < 3) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == p) {
                    stack.push(arr[i]);
                }
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop()).reverse();
            }

        } else {

            return;
        }

        int a[] = new int[sb.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
            System.out.print(arr[i] + " ");
        }
        getArray(arr, p + 1);
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
            getArray(arr, 0);

        } catch (NegativeArraySizeException e) {
            System.out.println("please enter positive size!");
        }
    }
}

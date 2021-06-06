/**Given an array arr of N integers. Find the contiguous sub-array with maximum sum.


Example 1:

Input:
N = 5
arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
N = 4
arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1) */
import java.util.*;
public class ContiguousArrayMaxSum {
    public static int getMaxSubArraySum(int arr[])
    {
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        for (int i = 0; i < arr.length; i++) {
            max_ending_here+=arr[i];
            if(max_so_far<max_ending_here)
            {
                max_so_far=max_ending_here;
            }
            if(max_ending_here<0)
            {
                max_ending_here=0;
            }
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println(getMaxSubArraySum(arr1));
        sc.close();
    }
    
}

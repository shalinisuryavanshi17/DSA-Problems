/**
 * Given two arrays a[] and b[] of size n and n respectively. The task is to find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in union.

Example 1:

Input:
5 3
1 2 3 4 5
1 2 3

Output: 
5

Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:

Input:
6 2 
85 25 1 32 54 6
85 2 

Output: 
7

Explanation: 
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
Your Task:
Complete doUnion funciton that takes a, n, b, m as parameters and returns the count of union elements of the two arrays.The printing is done by the driver code.

Constraints:
1 ≤ n, m ≤ 105
1 ≤ a[i], b[i] < 105

Expected Time Complexity : O((n+m)log(n+m))
Expected Auxilliary Space : O(n+m)
 */
import java.util.*;
public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        sc.close();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            if(!set.contains(arr1[i]))
            {
                set.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(!set.contains(arr2[i]))
            {
                set.add(arr2[i]);
            }
        }
        System.out.println(set.size());
    }
}


/**
 * Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.
Example 2:

Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given 
array is 15.
Your Task:
You don't have to read input or print anything. Your task is to complete the function kthSmallest() which takes the array, it's size and an integer k as input and returns the kth smallest element.
 
 
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 105
1 <= arr[i] <= 105
1 <= K <= N
 */
import java.util.*;

class KthMinEle {
    public void Quicksort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int pivot_index=partition(arr,start,end);
            Quicksort(arr, start, pivot_index-1);
            Quicksort(arr, pivot_index+1, end);
        }
        else{
            return;
        }
    }
    public int partition(int arr[],int start,int end)
    {
        int pivot=arr[end-1];
        int p_index=start;
        for (int i = start; i < end; i++) {

            if(arr[i]<pivot)
            {
                int temp=arr[p_index];
                arr[p_index]=arr[i];
                arr[i]=temp;
                p_index++;
            }
        }
        int temp=arr[p_index];
        arr[p_index]=arr[end-1];
        arr[end-1]=temp;
        return p_index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KthMinEle t = new KthMinEle();
        try {
            
            int n = sc.nextInt();
            int arr[]= new int[n];

            for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            }
            int k = sc.nextInt();
            sc.close();
            t.Quicksort(arr,0,arr.length);
            System.out.println("sorted array is");
                System.out.print(arr[k-1]+" ");
            
            
        } catch (NegativeArraySizeException e) {
            System.out.println("please enter positive size!");
        }
    }
}
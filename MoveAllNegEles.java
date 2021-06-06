
/**
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
 */

import java.util.*;

class MoveAllNegEles {
    public static void moveNegelements(int arr[],int start,int end) {
       if(start<end)
       {
           int pivot_index=partition(arr,start,end);
           moveNegelements(arr,start,pivot_index-1);
           moveNegelements(arr, pivot_index+1 ,end);
       }
       else{
           return;
       }

    }
    public static int partition(int arr[],int start,int end)
    {
        int pivot=arr[end];
        int p_index=start;
        for (int i = start; i < end; i++) {
            if(arr[i]<=pivot)
            {
                swap(arr,p_index,i);
                p_index++;
            }
            
        }
        swap(arr,p_index,end);
        return p_index;
    }
    public  static void swap(int arr[],int i,int p_index)
    {
        int temp=arr[p_index];
        arr[p_index]=arr[i];
        arr[i]=temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        moveNegelements(arr,0,arr.length-1);
          for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i]+" ");
          }
    }
}
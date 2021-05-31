import java.util.*;
class ReverseArray
{
    public static int[] getReverseArray(int arr[],int start,int end)
    {
       while(start<end)
       {
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int a[]=getReverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
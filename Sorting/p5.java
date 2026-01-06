// Sort the array using Merge Sort
// take two array and sort them and merge them in single array

// Simple Merge Sort Code (Easy to write in interview)

import java.util.*;

public class p5 {

    // merge two sorted parts
    static void merge(int arr[], int l, int m, int r) {
        int i = l;         // start of left part
        int j = m + 1;     // start of right part
        int k = 0;         // index for temp array

        int temp[] = new int[r - l + 1];

        // merge elements into temp array
        while(i <= m && j <= r) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        } 

        // remaining left elements
        while(i <= m) {
            temp[k++] = arr[i++];
        }

        // remaining right elements
        while(j <= r) {
            temp[k++] = arr[j++];
        }

        // copy back to original array
        for(int x = 0; x < temp.length; x++) {
            arr[l + x] = temp[x];
        }
    }

    // merge sort function (divide)
    static void mergeSort(int arr[], int l, int r) {
        if(l < r) {
            int mid = (l + r) / 2;     // midpoint
            mergeSort(arr, l, mid);    // left half
            mergeSort(arr, mid + 1, r);// right half
            merge(arr, l, mid, r);     // merge halves
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n-1);

        System.out.println("Sorted Array:");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

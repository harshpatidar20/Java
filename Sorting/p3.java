
//Insertion Sort Algorithm

// import java.util.*;

// public class p3 
// {
//     public static void insertionSort(int[] arr)                                      // T.C. = O(n^2) && S.C. = O(1)
//     {
//         int n = arr.length;
        
//         for(int i=1;i<n;i++) 
//         { // Start from second element
//             int key=arr[i]; // Current element to insert
//             int j=i-1;

//             // Move elements that are greater than key to one position ahead
//             while(j>=0 && arr[j]>key)                 // for acending order   // for descending order sort { arr[j] < key }
//             {
//                 arr[j+1] = arr[j];
//                 j--;
//             }

//             arr[j+1] = key; // Insert key at the correct position
//         }
//     }

//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();

//         System.out.println("Enter elements:");
//         int[] arr = new int[n];

//         for(int i=0;i<n;i++) 
//         {
//             arr[i]=sc.nextInt();
//         }

//         insertionSort(arr);

//         System.out.println("Sorted array:");
//         for(int i=0;i<n;i++) 
//         {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// Insertion Sort Program in Java

import java.util.*;

public class p3 {
    public static void insertion(int[] arr, int n) {
        for(int i = 1; i < n; i++) {
            int key = arr[i];      // element to insert
            int j = i - 1;         // pointer to previous element
            
            // shift larger elements to the right
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // place key in correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.print("Enter elements : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertion(arr, n);

        System.out.print("Sorted Array : ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa_java;

/**
 *
 * @author Jaime
 */
// Java program for implementation of Bubble Sort 
class BubbleSort {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /* Prints the array */
    void printArray(int arr[]) {
        System.out.println("Output:");
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + "\n");
        }
    }

    // Driver method to test above 
    public static void main(int[] arr, boolean o) {
        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(arr);
        System.out.println("BubbleSort Ejecutado Correctamente");
        if (o) {
            ob.printArray(arr);
        }
    }
}
/* This code is contributed by Rajat Mishra */

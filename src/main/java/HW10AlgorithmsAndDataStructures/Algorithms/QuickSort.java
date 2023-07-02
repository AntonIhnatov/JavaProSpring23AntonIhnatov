package main.java.HW10AlgorithmsAndDataStructures.Algorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 0, 4, 7, 3, 100, 10, 12, 1};
        quicksort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(arr, low, high);
        quicksort(arr, low, pivotIndex - 1);
        quicksort(arr, pivotIndex, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pointer = low - 1;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                pointer++;
                swap(pointer, i, arr);
            }
        }
        swap(pointer + 1, high, arr);
        return pointer + 1;
    }

    private static void swap(int pointer, int i, int[] arr) {
        int temp = arr[pointer];
        arr[pointer] = arr[i];
        arr[i] = temp;
    }
}

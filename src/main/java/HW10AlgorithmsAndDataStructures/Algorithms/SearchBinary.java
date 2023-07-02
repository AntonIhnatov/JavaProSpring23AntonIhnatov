package main.java.HW10AlgorithmsAndDataStructures.Algorithms;

public class SearchBinary {
    public static void main(String[] args) {
        int[] array = new int[] {32, 89, 88, 14, 7, 58, 22, 67, 90, 17, 25, 11, 48};
        MergeSort.mergeSort(array);
        System.out.println(MergeSort.arrayToString(array));
        System.out.println("---------------------------------------------------");
        System.out.println(searchBinary(array,0, array.length-1, 22));
    }
    public static int searchBinary(int array[], int startIndex, int endIndex, int elementToFind) {
        if (endIndex >= startIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == elementToFind) {
                System.out.println("Found value " + elementToFind + " in index " + middleIndex);
                return middleIndex;
            }

            if (array[middleIndex] > elementToFind) {
                return searchBinary(array, startIndex, middleIndex - 1, elementToFind);
            } else {
                return searchBinary(array, middleIndex + 1, endIndex, elementToFind);
            }
        }
        System.out.println("Element was not found in array");
        return -1;
    }
}

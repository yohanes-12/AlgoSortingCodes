import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Unsorted array: " + Arrays.toString(arr));
       // BubbleSort.bubbleSort(arr);
       // SelectionSort.selectionSort(arr);
        InsertionSort.insertionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

       // System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
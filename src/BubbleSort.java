public class BubbleSort {
    // Bubble sort algorithm
    public static void bubbleSort(int[] arr) {
       int leng = 0;
       boolean swapped = true;
        while (leng++ < arr.length &&  swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

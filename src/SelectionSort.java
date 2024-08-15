public class SelectionSort {

    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++){
            int index  = i;

            for (int j = i + 1; j < arr.length; j++){
                if (arr[index] > arr[j]){
                    index = j;
                }
            }

            if (index != i){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }

        }

    }
}

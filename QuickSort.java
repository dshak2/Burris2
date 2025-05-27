import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        int[] arr = {10, -3, 5, 2, 8, -1, 0, 15, 7, 3,
                     12, 6, 1, 9, 4, 11, 13, 14, -2, -5,
                     20, 18, 16, 19, 17, 25, 22, 21, 24, 23};

        System.out.println("Array before sorting: " + Arrays.toString(arr));
        sorter.quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}


import java.util.Arrays;

public class HeapSort {

    public static int[] heapSort(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length); 
        int n = copy.length;

        createMaxHeap(copy); 

        for (int i = n - 1; i > 0; i--) {
            swap(copy, 0, i);       
            heapify(copy, i, 0);     
        }

        return copy;
    }

    public static void createMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, heapSize, largest);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static int[] quickSort(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        quickSort(copy, 0, copy.length-1);
        return copy;
    }


    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }

        int pivotIndex = new Random().nextInt(high - low) + low;
        int pivot = arr[pivotIndex];
        swap(arr,pivot,high);
        int leftPointer = low;
        int rightPointer = high;

        while(leftPointer < rightPointer) {
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr,leftPointer,high);

        quickSort(arr, low, leftPointer -1);
        quickSort(arr, leftPointer + 1, high);

    }

    public static int partition(int[] arr, int low, int high) {
        return 1;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

public class InsertionSort {
public static int[] instertionSort(int[] numList) {
    int[] sorted = new int[numList.length];
    sorted[0] = numList[0];
    for(int j = 1; j < numList.length; j++) {
        int i = j - 1;
        sorted[j] = numList[j];
        while(i >= 0 && sorted[i] > sorted[i + 1]) {
            int temp = sorted[i + 1];
            sorted[i + 1] = sorted[i];
            sorted[i] = temp;
            i--; 
        }
    }
    return sorted;
}

public static void printArray(int[] arr) {
    for(int num : arr) {
        System.out.println(num + " ");
    }
}

}

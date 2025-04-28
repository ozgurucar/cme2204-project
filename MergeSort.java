import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] array, char sortType) {
        if(array.length <= 1) {
            return Arrays.copyOf(array, array.length);
        } 
        int mid = array.length / 2;

        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        left = mergeSort(left, sortType);
        right = mergeSort(right, sortType);
        return merge(array,left,right, sortType);
    }
    public static int[] merge(int[] array,int[] leftArr, int[] rightArr,char sortType) {
        int i = 0, j = 0;
        int index = 0;
        int[] sorted = new int[leftArr.length + rightArr.length];
        while(i < leftArr.length && j < rightArr.length) {
            if(sortType == 'a') {
            if(leftArr[i] <= rightArr[j]) {
                sorted[index++] = leftArr[i++];
            } else {
                sorted[index++] = rightArr[j++];
            }
        } else if(sortType == 'd') {
            if(leftArr[i] >= rightArr[j]) {
                sorted[index++] = leftArr[i++];
            } else {
                sorted[index++] = rightArr[j++];
            }
        }   
        }

        while(i < leftArr.length) {
            sorted[index++] = leftArr[i++];
        }

        while(j < rightArr.length) {
            sorted[index++] = rightArr[j++];
        }

        return sorted;
    }
}

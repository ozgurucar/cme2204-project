public class NumLists {
    public final static int[] random1K = Sorting.numList1K.stream().mapToInt(Integer::intValue).toArray();
    public final static int[] random10K = Sorting.numList10K.stream().mapToInt(Integer::intValue).toArray();
    public final static int[] random100K = Sorting.numList100K.stream().mapToInt(Integer::intValue).toArray();

    public static int[] asc1K = MergeSort.mergeSort(random1K, 'a');
    public static int[] desc1K = MergeSort.mergeSort(random1K, 'd');

    public static int[] asc10K = MergeSort.mergeSort(random10K, 'a');
    public static int[] desc10K = MergeSort.mergeSort(random10K, 'd');

    public static int[] asc100K = MergeSort.mergeSort(random100K, 'a');
    public static int[] desc100K = MergeSort.mergeSort(random100K, 'd');
}

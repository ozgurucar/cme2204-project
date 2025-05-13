import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Sorting {
    public static String file1K = "1K_random_input.txt";
    public static String file10K = "10K_random_input.txt";
    public static String file100K = "100K_random_input.txt";
    public static ArrayList<Integer> numList1K = readFile(file1K);
    public static ArrayList<Integer> numList10K = readFile(file10K);
    public static ArrayList<Integer> numList100K = readFile(file100K);
    public static void main(String[] args) {
        ProcessAndWrite.processAndWrite(NumLists.random100K, "mergesort_100K_random_output.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.random100K, "insertionsort_100K_random_output.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.random100K, "quicksort_100K_random_output.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.random100K, "heapsort_100K_random_output.txt", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.asc100K, "mergesort_100K_increasing_output.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.asc100K, "insertionsort_100K_increasing_output.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.asc100K, "quicksort_100K_increasing_output.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.asc100K, "heapsort_100K_increasing_output.txt", "heapsort");



        ProcessAndWrite.processAndWrite(NumLists.desc100K, "mergesort_100K_decreasing_output.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.desc100K, "insertionsort_100K_decreasing_output.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.desc100K, "quicksort_100K_decreasing_output.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.desc100K, "heapsort_100K_decreasing_output.txt", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.random10K, "mergesort_10K_random_output.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.random10K, "insertionsort_10K_random_output.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.random10K, "quicksort_10K_random_output.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.random10K, "heapsort_10K_random_output.txt", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.asc10K, "mergesort_10K_increasing_output.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.asc10K, "insertionsort_10K_increasing_output.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.asc10K, "quicksort_10K_increasing_output.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.asc10K, "heapsort_10K_increasing_output.txt", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.desc10K, "mergesort_10K_decreasing_output.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.desc10K, "insertionsort_10K_decreasing_output.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.desc10K, "quicksort_10K_decreasing_output.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.desc10K, "heapsort_10K_decreasing_output.txt", "heapsort");

        ProcessAndWrite.processAndWrite(NumLists.random1K, "mergesort_1K_random_output.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.random1K, "insertionsort_1K_random_output.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.random1K, "quicksort_1K_random_output.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.random1K, "heapsort_1K_random_output.txt", "heapsort");

        ProcessAndWrite.processAndWrite(NumLists.asc1K, "mergesort_1K_increasing_output.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.asc1K, "insertionsort_1K_increasing_output.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.asc1K, "quicksort_1K_increasing_output.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.asc1K, "heapsort_1K_increasing_output.txt", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.desc1K, "mergesort_1K_decreasing_output.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.desc1K, "insertionsort_1K_decreasing_output.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.desc1K, "quicksort_1K_decreasing_output.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.desc1K, "heapsort_1K_decreasing_output.txt", "heapsort");

        //InsertionSort.printArray(sorted);
        
        //int[] sortedMerge = MergeSort.mergeSort(NumLists.random100K,'d');
        //InsertionSort.printArray(sortedMerge);
        


    }

    public static ArrayList<Integer> readFile(String fileName) {
        ArrayList<Integer> numList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null) {
                numList.add(Integer.valueOf(line));
            }
    
            } catch (FileNotFoundException e) {
                System.err.println("File not found!");
            } catch (Error | IOException e) {
                System.err.println(e.getMessage());
            }       
            return numList;
        }
    
}
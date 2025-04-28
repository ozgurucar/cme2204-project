import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Sorting{
    public static String file1K = "1K_random_input.txt";
    public static String file10K = "10K_random_input.txt";
    public static String file100K = "100K_random_input.txt";
    public static ArrayList<Integer> numList1K = readFile(file1K);
    public static ArrayList<Integer> numList10K = readFile(file10K);
    public static ArrayList<Integer> numList100K = readFile(file100K);
    public static void main(String[] args) {
        ProcessAndWrite.processAndWrite(NumLists.random100K, "test", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.random100K, "test", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.random100K, "test", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.random100K, "test", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.asc100K, "test", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.asc100K, "test", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.asc100K, "test", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.asc100K, "test", "heapsort");



        ProcessAndWrite.processAndWrite(NumLists.desc100K, "test", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.desc100K, "test", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.desc100K, "test", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.desc100K, "test", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.random10K, "test", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.random10K, "test", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.random10K, "test", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.random10K, "test", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.asc10K, "test", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.asc10K, "test", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.asc10K, "test", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.asc10K, "test", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.desc10K, "test", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.desc10K, "test", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.desc10K, "test", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.desc10K, "test", "heapsort");

        ProcessAndWrite.processAndWrite(NumLists.random1K, "test", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.random1K, "test", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.random1K, "test", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.random1K, "test", "heapsort");

        ProcessAndWrite.processAndWrite(NumLists.asc1K, "test", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.asc1K, "test", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.asc1K, "test", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.asc1K, "test", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.desc1K, "test", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.desc1K, "test", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.desc1K, "test", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.desc1K, "test", "heapsort");

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
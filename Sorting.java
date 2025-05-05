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
        ProcessAndWrite.processAndWrite(NumLists.random100K, "mergesort-random100k.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.random100K, "insertionsort-random100k.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.random100K, "quicksort-random100k.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.random100K, "heapsort-random100k.txt", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.asc100K, "mergesort-asc100k.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.asc100K, "insertionsort-asc100k.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.asc100K, "quicksort-asc100k.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.asc100K, "heapsort-asc100k.txt", "heapsort");



        ProcessAndWrite.processAndWrite(NumLists.desc100K, "mergesort-desc100k.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.desc100K, "insertionsort-desc100k.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.desc100K, "quicksort-desc100k.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.desc100K, "heapsort-desc100k.txt", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.random10K, "mergesort-random10k.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.random10K, "insertionsort-random10k.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.random10K, "quicksort-random10k.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.random10K, "heapsort-random10k.txt", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.asc10K, "mergesort-asc10k.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.asc10K, "insertionsort-asc10k.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.asc10K, "quicksort-asc10k.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.asc10K, "heapsort-asc10k.txt", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.desc10K, "mergesort-desc10k.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.desc10K, "insertionsort-desc10k.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.desc10K, "quicksort-desc10k.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.desc10K, "heapsort-desc10k.txt", "heapsort");

        ProcessAndWrite.processAndWrite(NumLists.random1K, "mergesort-random1k.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.random1K, "insertionsort-random1k.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.random1K, "quicksort-random1k.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.random1K, "heapsort-random1k.txt", "heapsort");

        ProcessAndWrite.processAndWrite(NumLists.asc1K, "mergesort-asc1k.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.asc1K, "insertionsort-asc1k.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.asc1K, "quicksort-asc1k.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.asc1K, "heapsort-asc1k.txt", "heapsort");


        ProcessAndWrite.processAndWrite(NumLists.desc1K, "mergesort-desc1k.txt", "mergesort");
        ProcessAndWrite.processAndWrite(NumLists.desc1K, "insertionsort-desc1k.txt", "insertionsort");
        ProcessAndWrite.processAndWrite(NumLists.desc1K, "quicksort-desc1k.txt", "quicksort");
        ProcessAndWrite.processAndWrite(NumLists.desc1K, "heapsort-desc1k.txt", "heapsort");

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
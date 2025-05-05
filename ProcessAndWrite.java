import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProcessAndWrite {
    public static void processAndWrite(int[] arr, String fileName, String operation) {
        int[] sorted = new int[0];
        long start = 0, end = 0, elapsedTime = 0;
        if(operation.toLowerCase().equals("mergesort")) {
            System.out.print("Mergesort: ");
        start = System.nanoTime();
        sorted = MergeSort.mergeSort(arr, 'a');
        end = System.nanoTime();
        elapsedTime = end - start; // nanonsaniye cinsinden geçen süre
        }

        if(operation.toLowerCase().equals("insertionsort")) {
            System.out.print("Insertion Sort: ");

            start = System.nanoTime();
            sorted = InsertionSort.instertionSort(arr);
            end = System.nanoTime();
            elapsedTime = end - start; // nanonsaniye cinsinden geçen süre
        }

        if(operation.toLowerCase().equals("quicksort")) {
            System.out.print("Quicksort: ");

            start = System.nanoTime();
            sorted = QuickSort.quickSort(arr);
            end = System.nanoTime();
            elapsedTime = end - start; // nanonsaniye cinsinden geçen süre
        }

        if(operation.toLowerCase().equals("heapsort")) {
            System.out.print("Heapsort: ");

            start = System.nanoTime();
            sorted = HeapSort.heapSort(arr);
            end = System.nanoTime();
            elapsedTime = end - start; // nanonsaniye cinsinden geçen süre
        }
        System.out.println("Süre (ns): " + elapsedTime);
        System.out.println("Süre (ms): " + (elapsedTime / 1_000_000.0)); // milisaniye çevrilmiş hali
        System.out.flush();

        try(FileWriter fileWriter = new FileWriter(fileName)) {
            String algoName = fileName.substring(0,fileName.indexOf(".txt"));
            fileWriter.write("Algoritma : " + algoName + "  Süre (ms): " + String.valueOf(elapsedTime / 1_000_000.0));
            fileWriter.write(System.lineSeparator());

            for(int number : sorted) {
                fileWriter.write(String.valueOf(number));
                fileWriter.write(System.lineSeparator());

            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

}

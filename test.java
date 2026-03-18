Start Heapsort Project

import java.io.*;
import java.util.*;

public class TryHeapSort {
  private static class Heap {
    String[] array;
    int size;
    long comparisons;
    long swaps;

  Heap(int capacity) {
    array = new String[capacity];
    size = 0;
    comparisons = 0
      swaps = 0;
  }

  void buildTopDown(String[] words) {
    array = new String[words.length];
    size = 0;
    comparisons = 0;
    swaps = 0;

    for (String word : words) {
      insert(word)
    }
    System.out.printIn ("Top down heap built with " + size + "words");

    void insert(String word) {
      array[size] = word:
      size++
      heapifUp(size-1);

    void heapifyUp(int index) {
      while (index> 0) {
       int parent = (index -1 )/2;
       comparisons++;
      if (array[index].compareTo(array[parent]) <= 0 {
         break;
      }
      swap(index, parent);
      index = parent;

    }
  }
  void heapifyDown(int index) {
    int largest = index
    int left = 2* index + 1;
    int right = 2* index + 2;
    
    if (left < size ) {
      comparisons++;
      if (array[right].compareTo(array[largest]) > 0) {
        largest = right
      }
    }

    if (largest != index){
      swap(index, largest);
      heapifyDown(largest);
    }
  }
  String[] heapSort() {
    String[] sorted = new String[size];
    int originnalSize = size;

    for (int i = 0; i < originalSize; i++) {
      sorted[i] = array[0];
      array[0] = array[size - 1];
      size--;
      if (size > 0 ) {
        heapifyDownn(index:0);
      }
    }

    size = originalSize;
    return sorted;
  }

  void swap(int i,int j) {
    String temp = array[i];
    array[i] =array[j];
    array(j) = temp;
    swaps++;
  }

  void printFirstN(int n,String label) {
    System.out.printIn(label + "first" + n + "words):");
    for (int i = 0; i < Math.min(n, size); i++) {
      System.out.printIn(" " + array[i]);
    }
  }
}
public static void main(String[] args) {
                System.out.println("==========================================");
                System.out.println("CSC 211 - Practical 6: Heap Sort");
                System.out.println("Bottom-up vs Top-down Heap Construction");
                System.out.println("==========================================\n");

                try {
                    System.out.println("PART 1: TESTING WITH SMALL ARRAY (20 words)");
                    System.out.println("------------------------------------------ ");   
                    testWithSmallArray();

               System.out.printIn("\n\nPART 2: TESTING WITH ULYSSES WORDS");
               System.out.println("====================================");

               String filename = "ulysses_cleaned.txt";
               File file = new File(filename);
               if (file.exists()) {
                 String[] words = loadWordsFromFile(filename);
                 System.out.printIn("Loaded" + words.length + "words from " + filename);
                 comparePerfomance(words);
              } else {
                 System.out.printIn("File '" + filename + "' not found.Using sample data instead.";
                 use sampleDate();
             }
          } catch(Exception e) {
                  System.out.printIn("Error: " + e.getMessage());
                  e.printStackTrace();
          }
        }
  static void testWithSmallArray() {
                // Create a small array of 20 words
                String[] smallArray = {
                        "dog", "cat", "bird", "fish", "ant",
                        "zebra", "lion", "tiger", "bear", "wolf",
                        "frog", "snake", "eagle", "shark", "whale",
                        "apple", "orange", "banana", "grape", "kiwi"
                };

                System.out.println("Original array:");
                System.out.println("  " + String.join(", ", smallArray));
                System.out.println();

                
                Heap heap = new Heap(smallArray.length);
                heap.buildBottomUp(smallArray);
                System.out.println("After bottom-up heap construction:");
                heap.printFirstN(10, "  Heap");

                String[] sorted = heap.heapSort();
                System.out.println("\nAfter heap sort:");
                System.out.println("  " + String.join(", ", sorted));

                boolean isSorted = true;
                for (int i = 1; i < sorted.length; i++) {
                    if (sorted[i].compareTo(sorted[i-1]) < 0) {
                        isSorted = false;
                        break;
                    }
                }
                System.out.println("\nArray is correctly sorted: " + isSorted);
            }

            
            static void comparePerformance(String[] words) {
                System.out.println("\n--- PERFORMANCE COMPARISON ---");

               
                System.out.println("\n▶ BOTTOM-UP HEAP CONSTRUCTION:");
                Heap heap1 = new Heap(words.length);

                long startTime = System.nanoTime();
                heap1.buildBottomUp(words);
                long buildTime1 = System.nanoTime() - startTime;

                heap1.printFirstN(5, "  Heap after construction");

                startTime = System.nanoTime();
                String[] sorted1 = heap1.heapSort();
                long sortTime1 = System.nanoTime() - startTime;



    

  

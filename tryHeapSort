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

              System.out.printf("  Build time: %.3f ms%n", buildTime1 / 1_000_000.0);
                System.out.printf("  Sort time: %.3f ms%n", sortTime1 / 1_000_000.0);
                System.out.printf("  Total time: %.3f ms%n", (buildTime1 + sortTime1) / 1_000_000.0);
                System.out.println("  Comparisons: " + heap1.comparisons);
                System.out.println("  Swaps: " + heap1.swaps);
                System.out.println("  First 5 sorted words: " +
                        String.join(", ", Arrays.copyOfRange(sorted1, 0, 5)));

                // ===== TOP-DOWN TEST =====
                System.out.println("\n▶ TOP-DOWN HEAP CONSTRUCTION:");
                Heap heap2 = new Heap(words.length);

                startTime = System.nanoTime();
                heap2.buildTopDown(words);
                long buildTime2 = System.nanoTime() - startTime;

                heap2.printFirstN(5, "  Heap after construction");

                startTime = System.nanoTime();
                String[] sorted2 = heap2.heapSort();
                long sortTime2 = System.nanoTime() - startTime;

                // Display top-down results
                System.out.printf("  Build time: %.3f ms%n", buildTime2 / 1_000_000.0);
                System.out.printf("  Sort time: %.3f ms%n", sortTime2 / 1_000_000.0);
                System.out.printf("  Total time: %.3f ms%n", (buildTime2 + sortTime2) / 1_000_000.0);
                System.out.println("  Comparisons: " + heap2.comparisons);
                System.out.println("  Swaps: " + heap2.swaps);
                System.out.println("  First 5 sorted words: " +
                        String.join(", ", Arrays.copyOfRange(sorted2, 0, 5)));

                
                System.out.println("\n▶ COMPARISON SUMMARY:");
                double speedup = (double)(buildTime2 + sortTime2) / (buildTime1 + sortTime1);
                double compRatio = (double)heap2.comparisons / heap1.comparisons;

                System.out.printf("  Bottom-up is %.2f times faster overall%n", speedup);
                System.out.printf("  Top-down uses %.2f times more comparisons%n", compRatio);

                // Verify both sorts produce same result
                boolean sameResults = Arrays.equals(sorted1, sorted2);
                System.out.println("  Both sorts identical: " + sameResults);
            }

           
            static String[] loadWordsFromFile(String filename) throws IOException {
                List<String> words = new ArrayList<>();
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                String line;
                int lineCount = 0;

                while ((line = reader.readLine()) != null) {
                    lineCount++;
                    String[] parts = line.trim().split("\\s+");
                    for (String word : parts) {
                        // Clean the word (remove punctuation, convert to lowercase)
                        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                        if (!word.isEmpty()) {
                            words.add(word);
                        }
                    }
                }
                reader.close();

                System.out.println("  Read " + lineCount + " lines from file");
                return words.toArray(new String[0]);
            }

            // ==================== SAMPLE DATA FALLBACK ====================
            static void useSampleData() {
                // Create sample words (common English words)
                String[] sampleWords = {
                        "the", "be", "to", "of", "and", "a", "in", "that", "have", "I",
                        "it", "for", "not", "on", "with", "he", "as", "you", "do", "at",
                        "this", "but", "his", "by", "from", "they", "we", "say", "her", "she",
                        "or", "an", "will", "my", "one", "all", "would", "there", "their",
                        "what", "so", "up", "out", "if", "about", "who", "get", "which", "go",
                        "me", "when", "make", "can", "like", "time", "no", "just", "him", "know",
                        "take", "people", "into", "year", "your", "good", "some", "could", "them",
                        "see", "other", "than", "then", "now", "look", "only", "come", "its", "over",
                        "think", "also", "back", "after", "use", "two", "how", "our", "work",
                        "first", "well", "way", "even", "new", "want", "because", "any", "these",
                        "give", "day", "most", "us"
                };

                System.out.println("\nUsing " + sampleWords.length + " sample words for testing\n");
                comparePerformance(sampleWords);
            }
}



    

  

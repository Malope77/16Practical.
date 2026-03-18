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
      array[size] = words:
    
    
  

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

  void swap
      
    
  

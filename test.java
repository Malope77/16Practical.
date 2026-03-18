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

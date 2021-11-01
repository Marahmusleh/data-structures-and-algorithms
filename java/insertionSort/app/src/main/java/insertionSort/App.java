/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertionSort;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

  public static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int j = i - 1;
      int temp = arr[i];

      while (j >= 0 && temp < arr[j]) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = temp;
    }
    return arr;
  }

  public static void main(String[] args) {
     int[] arr = {8, 4, 23, 42, 16, 15};
     System.out.println(Arrays.toString(insertionSort(arr)));

    int[] arr2 = {8, 4, 23, 42, 16, 15};
   System.out.println(Arrays.toString(mergeSort(arr)));


  }



  public static int[] mergeSort(int[] arr) {
    int n = arr.length;
    if (n > 1) {
      int mid = n / 2;
      int[] left = new int[mid];
      int[] right = new int[n - mid];

      for (int i = 0; i < mid; i++) {
        left[i] = arr[i];
      }
      for (int i = mid; i < n; i++) {
        right[i - mid] = arr[i];
      }

      mergeSort(left);
      mergeSort(right);

      merge(left, right, arr);
    }
    return arr;
  }
  private static void merge(int[] left, int[] right, int[] arr) {
    int i = 0,
      j = 0,
      k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }
    while (i < left.length) {
      arr[k++] = left[i++];
    }
    while (j < right.length) {
      arr[k++] = right[j++];
    }
  }

}

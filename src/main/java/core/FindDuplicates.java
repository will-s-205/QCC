// T:O(n+m) - colomns+rows or O(n2)
// S:O(n) - store only found values

package core;

import java.util.*;

class findDuplicates {

  public static int[] findDuplicates(int[] arr1, int[] arr2) {
    Set<Integer> hset1 = new HashSet<>();
    Set<Integer> hset2 = new HashSet<>();

    // ADDING THE ELEMENTS OF THE FIRST ARRAY TO THE FIRST SET
    for (int num : arr1) {
      hset1.add(num);
    }

    // COMPARING THE TWO SETS AND ADDING THE COMMON ELEMENTS TO THE RESULT SET
    for (int num : arr2) {
      if (hset1.contains(num)) {
        hset2.add(num);
      }
    }

    // PRINT THE RESULT SET TO THE CONSOLE OUTPUT WINDOW (OPTIONAL)
    for (Integer i : hset2) {
      System.out.print(i + " ");
    }

    // CONVERTING THE RESULT SET TO AN ARRAY AND SORTING IT 
    int[] arr3 = new int[hset2.size()];
    int k = 0;
    for (Integer i : hset2) {
      arr3[k] = (int) i;
      k++;
    }
    Arrays.sort(arr3);

    // RETURN THE RESULT ARRAY
    return arr3;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 5, 6, 7 };
    int[] arr2 = { 3, 6, 7, 8, 20 };

    findDuplicates(arr1, arr2);
  }
}

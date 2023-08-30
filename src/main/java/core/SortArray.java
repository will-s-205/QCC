package core;

public class SortArray {

    public static void main(String[] args) {
        int[] numbers = { 64, 34, 25, 12, 22, 11, 90, 122, 255, 399, 444, 567, 600 };
        bubbleSort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        // Let's have a double for loop
        // The outer loop represents the number of times we will have to iterate
        // through the entire array to ensure it's fully sorted
        for (int i = 0; i < arr.length - 1; i++) {
            // The inner loop represents the number of times we will have to iterate
            // through the array to ensure that the largest element is at the end of the
            // array
            for (int j = 0; j < arr.length - 1; j++) {
                // If the current element is greater than the next element, then swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

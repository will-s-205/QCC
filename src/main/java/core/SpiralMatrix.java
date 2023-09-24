package core;

import java.util.ArrayList;
import java.util.List;

// The goal of this class is to provide a method to return the elements of a 2D matrix in a spiral order.
// The idea is to have 4 variables to represent the 4 edges of the matrix.
// We start with the top edge, and then move to the right edge, then the bottom
// edge, and finally the left edge.
// We use a while loop to keep doing this until we have reached the center of
// the matrix.
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Create a list to store the result
        List<Integer> result = new ArrayList<Integer>();
        
        // Create 4 variables to represent the 4 edges of the matrix
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        // Use a while loop to keep doing this until we have reached the center of the matrix
        while(true){
            // Add the top edge to the result list and increment top by 1 to move to the next edge of the matrix
            for(int i = left; i <= right; i++) result.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;
            
            // Add the right edge to the result list and decrement right by 1 to move to the next edge of the matrix
            for(int i = top; i <= bottom; i++) result.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;
            
            // Add the bottom edge to the result list and decrement bottom by 1 to move to the next edge of the matrix
            for(int i = right; i >= left; i--) result.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;
            
            // Add the left edge to the result list and increment left by 1 to move to the next edge of the matrix
            for(int i = bottom; i >= top; i--) result.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }
        
        // Return the result list containing the elements of the matrix in a spiral order
        return result;
    }

    // Test the above function with a sample matrix and print the result list to the console output window 
    public static void main(String[] args) {
        // Create a sample matrix to test the above function
        int[][] matrix = { { 1, 2, 3, 4 }, 
                           { 5, 6, 7, 8 }, 
                           { 9, 10, 11, 12 }, 
                           { 13, 14, 15, 16 } };
        // Create an instance of the above class and call the above function to get the elements of the matrix in a spiral order
        SpiralMatrix sm = new SpiralMatrix();
        // Store the result in a list and print it to the console output window 
        List<Integer> res = sm.spiralOrder(matrix);
        // Print the result list to the console output window 
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}

// Spiral Matrix
// Problem statement
// You are given a 2D matrix ‘MATRIX’ of ‘N’*’M’ dimension. You have to return the spiral traversal of the matrix.

// Example:

// Input:
// MATRIX = [ [1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60] ]
// Output:
// 1 3 5 7 20 60 34 30 23 10 11 16

// Explanation: Starting from the element in the first row and the first column, traverse from left to right (1 3 5 7), 
// then top to bottom (20 60), then right to left (34 30 23), then bottom to up (10) and then left to right (11 16).
public class day_18 {
    
    public static int[] spiralMatrix(int [][]MATRIX) {
        // Write your code here.
        if(MATRIX == null || MATRIX.length == 0) return new int[0];
        int row = MATRIX.length;
        int cols = MATRIX[0].length;
        int[] result  = new int[row*cols];
        int index = 0;
        int top = 0, bottom = row-1, left = 0, right = cols-1;
        while(top<=bottom && left<=right){
            for(int i = left; i<=right; i++){
                result[index++] = MATRIX[top][i];
            }
            top++;
            for (int i = top; i<=bottom; i++){
                result[index++]=MATRIX[i][right];
            }
            right--;
            if(top<=bottom){
                for(int i = right; i>=left; i--){
                    result[index++]=MATRIX[bottom][i];
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    result[index++]=MATRIX[i][left];
                }
                left++;
            }
            
        }
        return result;
    }
}

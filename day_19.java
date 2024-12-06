// Zero Matrix
// Problem statement
// You are given a matrix 'MATRIX' of dimension 'N' x 'M'. Your task is to make all the elements of row 'i' and column 'j' equal to 0 if any element in the ith row or jth column of the matrix is 0.

// Note:

// 1) The number of rows should be at least 1.

// 2) The number of columns should be at least 1.

// 3) For example, refer to the below matrix illustration: 
import java.util.ArrayList;
public class day_19 {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                if(matrix.get(i).get(j)==0){
                    zeroRows[i] = true;
                    zeroCols[j]=true;
                }
            }
        }
        for(int i = 0; i<rows; i++){
            if(zeroRows[i]){
                for(int j = 0 ; j<cols; j++){
                    matrix.get(i).set(j, 0);
                }
            }
        }
        for(int j = 0; j<cols; j++){
            if(zeroCols[j]){
                for(int i = 0; i<rows; i++){
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
}
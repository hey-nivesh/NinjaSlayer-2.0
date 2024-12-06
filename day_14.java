// Problem statement
// You have been given an array/list 'arr' consisting of 'n' elements.
// Each element in the array is either 0, 1 or 2.
// Sort this array/list in increasing order.
// Do not make a new array/list. Make changes in the given array/list.
// Example :
// Input: 'arr' = [2, 2, 2, 2, 0, 0, 1, 0]
// Output: Final 'arr' = [0, 0, 0, 1, 2, 2, 2, 2]
// Explanation: The array is sorted in increasing order.
import java.util.ArrayList;
import java.util.Collections;

public class day_14 {
     public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr.get(mid)==0){
                Collections.swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr.get(mid)==1){
                mid++;
            }else{
                Collections.swap(arr, mid, high);
                high--;
            }
        }
    }
    
}

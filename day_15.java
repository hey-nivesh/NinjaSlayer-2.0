// Implement Lower Bound
// Problem statement
// You are given an array 'arr' sorted in non-decreasing order and a number 'x'. You must return the index of the lower bound of 'x'.



// Note:
// 1. For a sorted array 'arr', 'lower_bound' of a number 'x' is defined as the smallest index 'idx' such that the value 'arr[idx]' is not less than 'x'.If all numbers are smaller than 'x', then 'n' should be the 'lower_bound' of 'x', where 'n' is the size of array.

// 2. Try to do this in O(log(n)).


// Example:
// Input: ‘arr’ = [1, 2, 2, 3] and 'x' = 0

// Output: 0

// Explanation: Index '0' is the smallest index such that 'arr[0]' is not less than 'x'.
public class day_15 {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int low =0, high = n-1;
        int result = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=x){
                result = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return result;
    }
}

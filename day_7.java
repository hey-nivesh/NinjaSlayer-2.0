// Reverse an Array
// Problem statement
// Given an array 'arr' of size 'n'.
// Return an array with all the elements placed in reverse order.
// Note:
// You don’t need to print anything. Just implement the given function.
// Example:
// Input: n = 6, arr = [5, 7, 8, 1, 6, 3]

// Output: [3, 6, 1, 8, 7, 5]

// Explanation: After reversing the array, it looks like this [3, 6, 1, 8, 7, 5].
public class day_7 {
    
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int start = 0;
        int end = n-1;
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;

    }
    
}

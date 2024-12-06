// Add One To Number
// Problem statement
// Given a non-negative number represented as an array of digits, you have to add 1 to the number, i.e, increment the given number by one.

// The digits are stored such that the most significant digit is at the starting of the array and the least significant digit is at the end of the array.

// For Example
// If the given array is {1,5,2}, the returned array should be {1,5,3}.
// Note
// Input array can contain leading zeros, but the output array should not contain any leading zeros (even if the input array contains leading zeroes).
// For Example: 
// If the given array is {0,2}, the returned array should be {3}.
import java.util.ArrayList;

public class day_12 {
    
public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        // Write your code here.
        while(arr.size()>1 && arr.get(0) ==0){
            arr.remove(0);
        }
        int n = arr.size();
        int carry = 1;
        for(int i=n-1; i>=0; i--){
            int sum = arr.get(i)+carry;
            arr.set(i, sum%10);
            carry = sum/10;
        }
        if(carry>0){
            arr.add(0, carry);
        }
        return arr;
    }
}

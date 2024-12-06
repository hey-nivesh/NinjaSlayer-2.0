// Number of digits
// Problem statement
// You are given a number 'n'.
// Return number of digits in ‘n’.
// Example:
// Input: 'n' = 123
// Output: 3
// Explanation:
// The 3 digits in ‘123’ are 1, 2 and 3. 
public class day_3 {
    public static int countDigits(int n){
        // Write your code here.
        if (n==0){
            return 1;
        }
        int cnt = 0;
        while(n!=0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
}

    


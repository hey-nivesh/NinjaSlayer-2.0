// Reverse a Number
// Problem statement
// You are given a number 'n'.
// Return an integer that is the reverse of ‘n’.
// Note:
// Reverse of ‘n’ means an integer where, 
// the most significant digit of ‘n’ is the least significant digit of the number, 
// the second most significant digit of ‘n’ is the second least significant digit of the number and so on.
public class day_six {
    
    public static int reverseNumber(int n) {
        // Write your code here
        int reversed = 0;
        while (n!=0){
            int digit = n%10;
            reversed = reversed*10+digit;
            n/=10;
        }
        return reversed;
    }
}

// Second Largest Number
// Problem statement
// You have been given an array ‘a’ of ‘n’ unique non-negative integers.
// Find the second largest and second smallest element from the array.
// Return the two elements (second largest and second smallest) as another array of size 2.
// Example :
// Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
// Output: [4, 2]
// The second largest element after 5 is 4, and the second smallest element after 1 is 2.
public class day_nine {
    
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int maxele = Integer.MIN_VALUE;
        int seclarele = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(a[i]>maxele){
                seclarele = maxele;
                maxele = a[i];
            }else if (a[i]>seclarele && a[i]!=maxele){
                seclarele = a[i];
            }
        }
        int minele = Integer.MAX_VALUE;
        int secsmaele = Integer.MAX_VALUE;
        for (int i=0; i<n; i++){
            if(a[i]<minele){
                secsmaele = minele;
                minele = a[i]; 
            }else if (a[i]>minele && a[i]<secsmaele){
                secsmaele = a[i];
            }
        }
            return new int[] {seclarele, secsmaele};
    }
}

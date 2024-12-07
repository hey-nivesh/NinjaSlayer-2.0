// Number of Inversions
// Problem statement
// There is an integer array ‘A’ of size ‘N’.



// Number of inversions in an array can be defined as the number of pairs of ‘i’, ‘j’ such that ‘i’ < ‘j’ and ‘A[i]’ > ‘A[j]’.

// You must return the number of inversions in the array.



// For example,
// Input:
// A = [5, 3, 2, 1, 4], N = 5
// Output:
// 7
// Explanation: 
// The pairs satisfying the condition for inversion are (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), and (3, 4). 
// The number of inversions in the array is 7.
// Detailed explanation ( Input/output format, Notes, Images )

public class day_21 {
    public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        return mergeSort(a, 0, n-1);
    }
    private static int mergeSort(int[] a, int left, int right){
        if(left>=right){
            return 0;
        }
        int mid = (left+right)/2;
        int inversions = mergeSort(a, left, mid)+mergeSort(a, mid+1, right);
        inversions += merge(a, left, mid, right);
        return inversions;
    }
    private static int merge(int[] a,int left, int mid, int right){
        int[] temp = new int[right-left + 1];
        int i = left, j= mid+1, k=0, inversions=0;
        while(i<=mid && j<=right){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }else{
                temp[k++] = a[j++];
                inversions += (mid-i+1);
            }
        }
        while(i<=mid && j<=right){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }else{
                temp[k++]=a[j++];
                inversions += mid-i+1;
            }
        }
        while (i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=right){
            temp[k++]=a[j++];
        }
        for(i = left, k=0; i<=right; i++ ,k++){
            a[i]=temp[k];
        }
        return inversions;
    }
}
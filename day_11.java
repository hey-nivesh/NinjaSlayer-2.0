// Two Sum
// Problem statement
// Sam want to read exactly ‘TARGET’ number of pages.

// He has an array ‘BOOK’ containing the number of pages for ‘N’ books.

// Return YES/NO, if it is possible for him to read any 2 books and he can meet his ‘TARGET’ number of pages.

// Example:
// Input: ‘N’ = 5, ‘TARGET’ = 5
// ‘BOOK’ = [4, 1, 2, 3, 1] 

// Output: YES
// Explanation:
// Sam can buy 4 pages book and 1 page book.
import java.util.HashSet;

public class day_11 {
    
    public static String read(int n, int []book, int target){
        // Write your code here.
        HashSet<Integer> pagesSet = new HashSet<>();
        for(int pages : book){
            if (pagesSet.contains(target - pages)){
                  return "YES";
            }
            pagesSet.add(pages);
        }
        return "NO";
    }
}

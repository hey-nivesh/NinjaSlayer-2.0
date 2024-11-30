// Highest / Lowest Frequency Elements
// Problem statement
// Given an array 'v' of 'n' numbers.
// Your task is to find and return the highest and lowest frequency elements.
// If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.
// Example:
// Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]

// Output: 1 2

// Explanation: The element having the highest frequency is '1', and the frequency is 3.
// The elements with the lowest frequencies are '2', '3', and '4'.
//  Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].
import java.util.HashMap;
import java.util.Map;

public class day_ten {
    
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : v){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
        }
        int minFrequency = Integer.MAX_VALUE;
        int maxFrequency = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            int key = entry.getKey();
            int freq = entry.getValue();
            if (freq < minFrequency || (freq == minFrequency && key < minElement)) {
                minFrequency = freq;
                minElement = key;
            }
            if (freq > maxFrequency || (freq == maxFrequency && key < maxElement)) {
                maxFrequency = freq;
                maxElement = key;
            }
        }
        return new int[]{maxElement, minElement};
    }
}

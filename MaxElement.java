// Problem Statement :
// Given an array, we have to find the largest element in the array.
// Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
// Output: 5
// Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
// Sample Input 1:
// 6
// 4 7 8 6 7 6 
// Sample Output 1:
// 8
// Explanation Of Sample Input 1:
// The answer is 8.
// From {4 7 8 6 7 6}, 8 is the largest element.
// Sample Input 2:
// 8
// 5 9 3 4 8 4 3 10 
// Sample Output 2:
// 10
// Expected Time Complexity:
// O(n), Where ‘n’ is the size of an input array ‘arr’.
// Constraints :
// 1 <= 'n' <= 10^5
// 1 <= 'arr[i]' <= 10^9
// Time Limit: 1 sec

import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        Arrays.sort(arr);
        return arr[n-1];

    }
}

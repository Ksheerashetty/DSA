// Check if an Array is Sorted
// Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
// Note: Two consecutive equal values are considered to be sorted.
// Sample Input 1 :
// 4
// 0 0 0 1
// Sample Output 1 :
// 1
// Explanation For Sample Input 1 :
// The given array is sorted in non-decreasing order; hence the answer will be 1. 
// Sample Input 2 :
// 5
// 4 5 4 4 4
// Sample Output 2 :
// 0
// Expected Time Complexity:
// O(n), Where ‘n’ is the size of an input array ‘a’.
// Constraints:
// 1 ≤ 'n' ≤ 10^5
// 0 ≤ 'a'[i] ≤ 10^9
// Time limit: 1 sec
import java.*;
public class Sorted {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        if(n==1)
        return 1;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1])
            return 0;
        }
        return 1;
    }
}

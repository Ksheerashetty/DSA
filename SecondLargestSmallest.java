// Find Second Smallest and Second Largest Element in an array
// Problem Statement: 
// Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
// Sample Input 1 :
// 4
// 3 4 5 2
// Sample Output 1 :
// 4 3
// Explanation For Sample Input 1 :
// The second largest element after 5 is 4 only, and the second smallest element after 2 is 3.
// Sample Input 2 :
// 5
// 4 5 3 6 7
// Sample Output 2 :
// 6 4
// Expected Time Complexity:
// O(n), Where ‘n’ is the size of an input array ‘a’.
// Constraints:
// 2 ≤ 'n' ≤ 10^5
// 0 ≤ 'a'[i] ≤ 10^9
// Time limit: 1 sec

import java.util.*;
import java.util.Arrays;
public class SecondLargestSmallest {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int[] res=new int[2];
        if(n<2){
            Arrays.fill(res,-1);
        }
        Arrays.sort(a);
        res[1]=a[1];
        res[0]=a[n-2];
        return res;
    }
}

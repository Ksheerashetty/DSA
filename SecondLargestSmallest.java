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
        // 1.Brute force
        // int[] res=new int[2];
        // if(n<2){
        //     Arrays.fill(res,-1);
        //     return res;
        // }
        // Arrays.sort(a);
        // res[1]=a[1];
        // res[0]=a[n-2]; // this might not be optimal if we've array like 1123344 we'll be getting answer as 
        //4 and 1 which is clearly wrong we should be actually getting 3 and 2
        //A better approach with O(n)
         int large=Integer.MIN_VALUE,sl=Integer.MIN_VALUE;
         int small=Integer.MAX_VALUE,ss=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>large){
                 sl=large;
                large=a[i];   
            }else if(a[i]!=large && a[i]>sl){
                sl=a[i];
            }
             if(a[i]<small){
                 ss=small;
                small=a[i];   
            }else if(a[i]!=small && a[i]<ss){
                ss=a[i];
            }
        }
        res[0]=sl;
        res[1]=ss;
        return res;
    }
}

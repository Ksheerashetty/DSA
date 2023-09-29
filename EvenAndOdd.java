// Sum of even & odd
// Send Feedback
// Write a program to input an integer N and print the sum of all its 
// even digits and sum of all its odd digits separately.
// Digits means numbers not the places. That is, if the given integer is "13245", 
// even digits are 2 & 4 and odd digits are 1, 3 & 5.
// Input format :
//  Integer N
// Output format :
// Sum_of_Even_Digits Sum_of_Odd_Digits
// (Print first even sum and then odd sum separated by space)
// Sample Input :
// 1234
// Sample Output :
// 6 4

import java.util.Scanner;
public class EvenAndOdd {
	public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int odd=0,even=0;
		while(n>0){
			int dig=n%10;
			if(dig%2==0)
				even+=dig;
			else
				odd+=dig;
			
			n=n/10;
		}
		System.out.println(even+" "+odd);
	}
}

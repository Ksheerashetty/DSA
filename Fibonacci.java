// Nth Fibonacci Number
// Nth term of fibonacci series F(n) is calculated using following formula -
//     F(n) = F(n-1) + F(n-2), 
// Provided N you have to find out the Nth Fibonacci Number. Also F(1) = F(2) = 1.
// Input Format :
// Integer n
// Constraints:
// Time Limit: 1 second
// Output Format :
// Nth Fibonacci term i.e. F(n)
// Sample Input :
// 4
// Sample Output :
// 3 


import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        int f1=0,f2=1,f3;
       if(n<=1)
		       System.out.print(n);	   
        else
        {
            for(int i=2;i<=n;i++){
                f3=(f1+f2)%1000000007; //Since number can be very large
                f1=f2;
                f2=f3;
            }
			       System.out.print(f2);
        }
    }
}

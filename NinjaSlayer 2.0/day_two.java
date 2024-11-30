// Nth Fibonacci Number
// Problem statement
// The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

//     F(n) = F(n - 1) + F(n - 2), 
//     Where, F(1) = 1, F(2) = 1

// Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.
// "Indexing is start from 1"

import java.util.Scanner;

public class day_two {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
       Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   if (n==1 || n==2){
		   System.out.println(1);
	   }
	   else{
		   int a = 1, b=1, fib = 0;
		   for(int i=3; i<=n; i++){
			   fib = a+b;
			   a=b;
			   b=fib;
		   }
		   System.out.println(fib);
	   }
		sc.close();
	}

}

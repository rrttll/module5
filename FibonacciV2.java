/* 
* This program implements the Fibonacci function in both a recursive and iterative fashion.
* It also prints out a chart of the runtime efficiency of each.
* 
* Author:  <Richard Lloyd>
* Date:    <3/1/2023>
*/
import java.util.*;
public class FibonacciV2 {
	// Recursive Fibonacci function
	public static int fibonacciRecursive(int n) {
	    if (n == 0 || n == 1) {
	        return n;
	        }
	        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	        }
	    // Iterative Fibonacci function
	    public static int fibonacciIterative(int n) {
	        int a = 0, b = 1, c;
	        if (n == 0) {
	            return a;
	        }
	        for (int i = 2; i <= n; i++) {
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        return b;
	    }
	    public static void main(String[] args) {
	    // Print out the table header
	    System.out.println("Input |  Recursive (ns) |  Iterative (ns)");
	    // Calculate and print out the runtime of each algorithm
	    for (int i = 0; i <= 10; i++) {
	        long startTimeRecursive = System.nanoTime();
            fibonacciRecursive(i);
            long endTimeRecursive = System.nanoTime();
            long durationRecursive = endTimeRecursive - startTimeRecursive;
            long startTimeIterative = System.nanoTime();
            fibonacciIterative(i);
            long endTimeIterative = System.nanoTime();
            long durationIterative = endTimeIterative - startTimeIterative;
            System.out.println(i + "           " + durationRecursive + "             " + durationIterative);
        }
    }
}
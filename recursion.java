import java.util.*;
public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return helpersprt(n, 1, tolerance);
    }
    public static double helpersprt(double n, double guess, double tolerance) {
      if (tolerance < guess / n || tolerance < n / guess) {
        return guess;
      }
      return helpersprt(n, ((n / guess) + guess) / 2, tolerance);
    }
    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1
     *fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return 0;
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      return null;
    }

}

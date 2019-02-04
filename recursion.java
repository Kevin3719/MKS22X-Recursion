import java.util.*;
public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return helpersprt(n, 1.0, tolerance);
    }
    public static double helpersprt(double n, double guess, double tolerance) {
      if (tolerance > Math.abs((guess * guess - n) / (guess * guess))) {
        return guess;
      }
      return helpersprt(n, ((n / guess) + guess) / 2.0, tolerance);
    }
    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1
     *fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return helperfib(n, 0, 0, 1);
    }

    public static int helperfib(int n, int start, int a, int b) {
      if (n == start) {
        return a;
      }
      return helperfib(n, start + 1, b, a + b);

    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      return null;
    }

}

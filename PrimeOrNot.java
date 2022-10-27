import java.math.*;
public class PrimeOrNot {

    public static void main(String[] args) {
  
      int num = 9;
        System.out.println(Math.sqrt(num));
      boolean flag = false;
      for (int i = 2; i <= Math.sqrt(num); ++i) {
        // condition for nonprime number
        if (num % i == 0) {
          flag = true;
          break;
        }
      }
  
      if (!flag)
        System.out.println(num + " is a prime number.");
      else
        System.out.println(num + " is not a prime number.");
    }
  }
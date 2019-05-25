/* Program that return either true  if a number is a prime number
   and false if it is not */

public class Funtion2 {

  public static void main(String[] args) {

    //Takes a number as command line argument
    int b = Integer.parseInt(args[0]);
    System.out.println("Is it a prime?\n" + isPrime(b));

  }

  public static boolean isPrime(int n ) {

    //All numbers less that 2 are not prime
    if(n < 2) {
      return false;
    }

      /*We enter the for loop check if the number we have given is even
        obviously if the number is even the number is a not prime number
        then we return false
      */

      for (int i = 2; i <= n/i; i++) {

        //If a number is even ==> not prime
        if( n % i == 0) {
        //  StdOut.println(i);
          return false;
        }
        /*If the number happens not to fit the if statement then the for loop
        will run until it reaches it's stopping condition once this condition is
        reached we exit the for loop and return the default value false*/
          StdOut.println(i);
      }
      return true;
    }
  }

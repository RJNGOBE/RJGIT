public class Arrays2 {

  /* In this code I try to solve what is the maximum elements an array
    can store*/

  public static void main(String[] args) {

    /* Int overflow = this occurs when you try an store a number
      which is greater than Integer.MAX_VALUE the program will
      return Integer.MIN_VALUE which results in a negative number
      */

    //int n = Integer.MAX_VALUE - 5;
    int y = 2147483647 - 8;
    int b [] = new int [y];
    //int a [] = new int[n*n*n*n];
    //System.out.println(a.length);

    System.out.println("Int max value = " + Integer.MAX_VALUE + " Int min value = " + Integer.MIN_VALUE);
    //System.out.println(b.length);

    /* I still have not figured out what the maximum amount of elements which
       can be stored in an array are but rumour has it is Integer.MAX_VALUE but
       in my test it still did not work*/

  }

}

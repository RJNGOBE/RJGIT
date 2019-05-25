/*Program checks if you can find a value of an elemnt of an array without inputing
  any value yourself (i.e not giving the array any values)*/

public class Compile {

  public static void main(String[] args) {

    //After this every value in the array is set to zero by default
    int a [] = new int [1000];
    //Value is zero like all other 999 values inside the array
    int b = a[a.length-1];

    //The 1000th element is 0
    System.out.println("The 100th element is " + b);
  }
}

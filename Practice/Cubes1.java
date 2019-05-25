public class Cubes1 {

  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);

    for ( int i = 1; i <= N; i++) {
      /*We print out i(the iteration) and the value we get after
      calling the funtion cube funtion
      e.g i = 1 then we call cube(1) then we iterate
          i = 2 then we call cube(2) then we iterate so forth
      */
      StdOut.println(i + " " + cube(i));
    }
  }
  
  public static int cube( int i ) {

    //Calculates the cube of i and stores to j
    int j = i*i*i;
    //send back the cube (i.e j)
    return j;
  }


}

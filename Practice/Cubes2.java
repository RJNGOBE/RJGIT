public class Cubes2 {

  public static void main(String[] args) {

    int N = Integer.parseInt(args[0]);

    for ( int i = 1; i < N; i++) {
      StdOut.println(i + " " + cube(i));
    }
  }

  public static int cube(int i) {
    /* int i = i * i * i this won't work because we
    have already defined i on the argument type*/

    /*NB: a funtion which isn't void will produce compilation
    error if no return statement is found.*/

    /* (i = i*i*i;) this will work(find cube) because we did notation
    redefine i. We acknowleged that it is already defined on the argument
    type call
    */

    //This will return the cube of the value we got from the funtion call!
    return i * i * i;
  }
}

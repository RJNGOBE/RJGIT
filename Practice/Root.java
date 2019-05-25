public class Root {


    public static void main(String[] args) {

      StdOut.println("What is the magic number? ");
      String y = StdIn.readLine();
      double f = Double.parseDouble(y);
      StdOut.printf("Your square root is %.2f\n" ,sqrt(f));
    }


    public static double sqrt ( double c ) {

      if ( c < 0 ) {
        return Double.NaN;
      }

      double err = 1e-15;
      double t = c;

      while ( Math.abs( t - c/t ) > err*t) {
        t = (c/t+t) /2.0;

      }
        return t;
    }

}

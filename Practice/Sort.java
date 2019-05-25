//Program has same exact operations as Arrays3.java

public class Sort {

  public static void main(String[] args) {
    int a [] = {1,2,3,4,6,7,72,8,9,0,14,54};

    int y = a.length;
    int b [] = new int [y];
    int z = y;

    //Place values of a in array back from the last one to the first one
    for (int i = 0; i <= a.length - 1; i++) {
      b[z-1] = a[i];
      z = z - 1;
    }

    //print out all the elements of b
    for(int u = 0; u <= a.length - 1;u++) {
      StdOut.println(b[u]);
    }
  }

}

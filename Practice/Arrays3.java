public class Arrays3 {

  //Program that reverses the contents of an array

  public static void main(String[] args) {

    int [] arr = {10,20,30,40,50};

    int n = arr.length;
    int b [] = new int[n];
    //Store the length of an array in j
    int j = n;

    for (int i = 0; i < n; i++) {
      //Stores first elemnt of a as the last element of break;
      //Decrement j so that it goes to the next value
      b[j - 1] = arr[i] ;
      j = j - 1;
}
    for (int k = 0; k < n; k++) {
      System.out.println(b[k]);
    }
    }

}

public class PassbyValue {

    //intuitive idea of pass by values

    public static void main(String[] args) {
      int number = 25;
      StdOut.println("Before we go to DSP funtion number = " + number);
      /*Calling the funtion dsp with the value number doesn't change number
        NB: number doesn't change
      */

      dsp(number);
      StdOut.println("After we call DSP funtion number = " + number);

      //here we call dsp with value number and the value we get as a return is our value

      StdOut.println("When we call DSP funtion directly = " + dsp(number));
    }

    public static int dsp(int num) {

      //Take the value we get num and add one to it
      //We then equate our summation to num
      num = num + 1;

      return num;
    }
}

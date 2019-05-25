public class Roman {

    public static void main(String[] args) {
        //You may assume that N > 0
        int N = Integer.parseInt(args[0]);
        String output = "";

        int d[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String s[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        while (N > 0)
        {
            for (int k = s.length-1;k>=0;k--)
            {
                if (N >= d[k])
                {
                    //N = N - d[k]
                    N -= d[k];
                    //output = output + s[k]
                    output += s[k];
                    break;
                }
            }
        }
        System.out.println(output);
    }
}

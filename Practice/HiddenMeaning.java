public class HiddenMeaning {

	public static int fff(int p, int q) {
		p++;
		int r = p + q;
		q++;
		System.out.println("(A) " + p);
		System.out.println("(B) " + q);
		System.out.println("(C) " + r);
		return r;
	}

	public static int ggg(int x, int y) {
		x = 1 + x;
		y = 3 - x;
		System.out.println("(D) " + x);
		System.out.println("(E) " + y);
		return y + x;
	}

	public static void main(String[] args) {
		int p = 5;
		int q = 1;
		int x = 2;
		q = fff(p, x);
		x = ggg(q, x);
		System.out.println("(F) " + p);
		System.out.println("(G) " + q);
		System.out.println("(H) " + x);
	}

}

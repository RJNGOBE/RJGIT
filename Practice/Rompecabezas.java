public class Rompecabezas {

	public static int fff(int[] p, int q) {
		p[q % 2] = p[0] + 1;
		System.out.println("(A) " + p[0]);
		System.out.println("(B) " + p[1]);
		System.out.println("(C) " + q);
		return p[0] + p[1];
	}

	public static int ggg(int[] x, int[] y) {
		x[0] = fff(y, x[0]);
		System.out.println("(D) " + x[0]);
		System.out.println("(E) " + x[1]);
		System.out.println("(F) " + y[0]);
		System.out.println("(G) " + y[1]);
		return x[1] - y[0];
	}

	public static void main(String[] args) {
		int[] p = {0, 1, 0};
		int[] q = {1, 2, 1};
		int[] x = {1, 1, 4};
		int r = ggg(p, q);
		int s = fff(q, q[0]);
		System.out.println("(H) " + p[0]);
		System.out.println("(I) " + q[0]);
		System.out.println("(J) " + x[0]);
		System.out.println("(K) " + r);
		System.out.println("(L) " + s);
	}

}

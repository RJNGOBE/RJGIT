public class ArrayManu {

	public static int get(int[] x, int i) {
		return x[(i + 1) % x.length];
	}

	public static void put(int[] x, int i, int v) {
		x[(i + 2) % x.length] = v;
	}

	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3};
		for (int i = 0; i < 4; i++) {
			put(a, i, a[i] + 1);
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(get(a, i) + " ");
		}
		System.out.println();
	}

}

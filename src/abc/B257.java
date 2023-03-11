package abc;

import java.io.PrintWriter;
import java.util.Scanner;

public class B257 {

    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int n = scanner.nextInt();
	int k = scanner.nextInt();
	int q = scanner.nextInt();

	int[] a = new int[k + 1];

	for (int i = 0; i < k; i++) {
	    a[i] = scanner.nextInt();
	}

	a[k] = n + 1;

	for (int j = 0; j < q; j++) {
	    int l = scanner.nextInt() - 1;
	    if (a[l] == n) {
		continue;
	    }
	    if (a[l] + 1 == a[l + 1]) {
		continue;
	    }
	    a[l] += 1;
	}

	for (int i : a) {
	    if (i <= n) {
		pw.print(i + " ");
	    }
	}

	pw.close();
	scanner.close();
    }

}

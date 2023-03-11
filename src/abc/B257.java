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

	int[] a = new int[k];
	int[] l = new int[q];
	boolean[] cell = new boolean[n];

	for (int i = 0; i < k; i++) {
	    a[i] = scanner.nextInt();
	    cell[a[i] - 1] = true;
	}
	for (int i = 0; i < q; i++) {
	    l[i] = scanner.nextInt();
	}

	for (int i = 0; i < q; i++) {
	    int cnt = 0;
	    for (int j = 0; j < n; j++) {
		if (cell[j]) {
		    cnt += 1;
		}
		if (cnt == l[i] && j != n - 1) {
		    if (!cell[j + 1]) {
			cell[j] = false;
			cell[j + 1] = true;
		    }

		}
	    }

	}

	for (int i = 0; i < cell.length; i++) {
	    if (cell[i]) {
		pw.print(i + 1 + " ");
	    }
	}

	pw.close();
	scanner.close();
    }

}

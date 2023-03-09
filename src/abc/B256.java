package abc;

import java.io.PrintWriter;
import java.util.Scanner;

public class B256 {
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int n = scanner.nextInt();
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
	    a[i] = scanner.nextInt();
	}

	int ans = 0;
	boolean[] cell = new boolean[4];

	for (int i = 0; i < n; i++) {
	    cell[0] = true;
	    for (int j = 3; j >= 0; j--) {
		if (cell[j]) {
		    cell[j] = false;
		    int nextPos = j + a[i];
		    if (nextPos < 4) {
			cell[nextPos] = true;
		    } else {
			ans += 1;
		    }
		}
	    }
	}

	System.out.println(ans);

	pw.close();
	scanner.close();
    }

}

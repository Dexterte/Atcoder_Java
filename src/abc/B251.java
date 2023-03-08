package abc;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B251 {

    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int w = scanner.nextInt();
	int[] a = new int[n];

	Set<Integer> set = new HashSet<>();

	for (int i = 0; i < n; i++) {
	    a[i] = scanner.nextInt();
	}

	for (int i = 0; i < a.length; i++) {
	    set.add(a[i]);
	    for (int j = i + 1; j < a.length; j++) {
		set.add(a[i] + a[j]);
		for (int k = j + 1; k < a.length; k++) {
		    set.add(a[i] + a[j] + a[k]);
		}
	    }
	}
	int ans = 0;
	for (Integer i : set) {
	    if (i <= w) {
		ans += 1;
	    }
	}

	System.out.println(ans);

	pw.close();
	scanner.close();
    }

}

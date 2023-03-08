package abc;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B252 {

    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int n = scanner.nextInt();
	int k = scanner.nextInt();

	List<Integer> a = new ArrayList<>();
	List<Integer> b = new ArrayList<>();
	for (int i = 0; i < n; i++) {
	    a.add(scanner.nextInt());
	}
	for (int i = 0; i < k; i++) {
	    b.add(scanner.nextInt());
	}

	int maxValue = Collections.max(a);

	for (Integer bb : b) {
	    if (a.get(bb - 1).equals(maxValue)) {
		System.out.println("Yes");
		System.exit(0);
	    }
	}

	System.out.println("No");

	pw.close();
	scanner.close();
    }

}

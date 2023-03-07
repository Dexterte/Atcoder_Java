package abc;

import java.io.PrintWriter;
import java.util.Scanner;

public class B249 {

    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	char[] s = scanner.next().toCharArray();

	boolean lowerFlag = false;
	boolean upperFlag = false;

	int a[] = new int[256];

	for (char c : s) {
	    if (Character.isLowerCase(c)) {
		lowerFlag = true;
	    }
	    if (Character.isUpperCase(c)) {
		upperFlag = true;
	    }

	    a[c] += 1;
	    if (1 < a[c]) {
		System.out.println("No");
		System.exit(0);
	    }

	}

	if (lowerFlag && upperFlag) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}

	pw.close();
	scanner.close();

    }

}

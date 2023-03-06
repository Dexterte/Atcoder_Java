package abc;

import java.util.Scanner;

public class B247 {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int n = scanner.nextInt();
	String[] s = new String[n];
	String[] t = new String[n];

	for (int i = 0; i < n; i++) {
	    s[i] = scanner.next();
	    t[i] = scanner.next();
	}

	boolean flagS = true;
	boolean flagT = true;

	for (int i = 0; i < n; i++) {
	    String targetS = s[i];
	    String targetT = t[i];
	    for (int j = 0; j < n; j++) {
		if (i != j) {
		    if (targetS.equals(s[j]) || targetS.equals(t[j])) {
			flagS = false;
		    }
		    if (targetT.equals(s[j]) || targetT.equals(t[j])) {
			flagT = false;
		    }
		}
	    }

	}

	if (flagS || flagT) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}

	scanner.close();

    }

}

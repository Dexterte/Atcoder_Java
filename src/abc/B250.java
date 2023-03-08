package abc;

import java.io.PrintWriter;
import java.util.Scanner;

public class B250 {
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int n = scanner.nextInt();
	int a = scanner.nextInt();
	int b = scanner.nextInt();

	int na = n * a;
	int nb = n * b;

	char[][] x = new char[na][nb];

	for (int i = 0; i < na; i++) {
	    for (int j = 0; j < nb; j++) {
		int r = i / a;
		int s = j / b;
		if ((r + s) % 2 == 0) {
		    x[i][j] = '.';
		} else {
		    x[i][j] = '#';
		}
	    }
	}

	for (int i = 0; i < na; i++) {
	    System.out.println(x[i]);
	}

	pw.close();
	scanner.close();

    }

}

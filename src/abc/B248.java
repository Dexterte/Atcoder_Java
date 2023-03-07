package abc;

import java.io.PrintWriter;
import java.util.Scanner;

public class B248 {

    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	long a = scanner.nextLong();
	long b = scanner.nextLong();
	long k = scanner.nextLong();

	long cnt = a;
	int ans = 0;
	while (cnt < b) {
	    ans += 1;
	    cnt *= k;
	}

	System.out.println(ans);

	pw.close();
	scanner.close();

    }

}

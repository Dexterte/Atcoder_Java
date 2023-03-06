package abc;

import java.io.PrintWriter;
import java.util.Scanner;

public class B244 {

    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
	var scanner = new Scanner(System.in);
	int n = Integer.parseInt(scanner.next());
	char[] tt = scanner.next().toCharArray();

	int[] dx = { 1, 0, -1, 0 };
	int[] dy = { 0, -1, 0, 1 };

	int x = 0;
	int y = 0;
	int direction = 0;
	for (char t : tt) {
	    System.out.println();
	    if (t == 'S') {
		x += dx[direction];
		y += dy[direction];
	    } else if (t == 'R') {
		direction += 1;
		direction = direction % 4;
	    }
	}

	pw.println(x + " " + y);
	pw.close();
	scanner.close();

    }

}

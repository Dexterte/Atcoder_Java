package abc;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B253 {

    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int h = scanner.nextInt();
	int w = scanner.nextInt();

	char[][] s = new char[h][w];
	for (int i = 0; i < h; i++) {
	    s[i] = scanner.next().toCharArray();
	}

	List<List<Integer>> xy = new ArrayList<>();
	for (int i = 0; i < h; i++) {
	    for (int j = 0; j < w; j++) {
		if (s[i][j] == 'o') {
		    xy.add(List.of(i, j));
		}
	    }
	}

	int disX = Math.abs(xy.get(0).get(0) - xy.get(1).get(0));
	int disY = Math.abs(xy.get(0).get(1) - xy.get(1).get(1));

	System.out.println(disX + disY);

	pw.close();
	scanner.close();
    }

}

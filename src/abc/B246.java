package abc;

import java.io.PrintWriter;
import java.util.Scanner;

public class B246 {

    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();

	double dis = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

	pw.println(a / dis + " " + b / dis);

	pw.close();
	scanner.close();

    }

}

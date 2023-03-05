package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B245 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	List<String> a = new ArrayList<String>();
	for (int i = 0; i < n; i++) {
	    a.add(scanner.next());
	}

	int ans = -1;
	for (int i = 0; i <= 2000; i++) {
	    if (!a.contains(String.valueOf(i))) {
		ans = i;
		break;
	    }

	}
	System.out.println(ans);

    }

}

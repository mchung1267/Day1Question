import java.util.ArrayList;
import java.util.Scanner;

public class questionFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) {
            System.exit(0);
        }
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        for(String a: list) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < m; i++) {
                result.append(a.charAt(i));
            }
            System.out.println(result.reverse().toString());
        }
    }
}

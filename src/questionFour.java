import java.util.ArrayList;
import java.util.Scanner;

public class questionFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n == 0) {
            System.exit(0);
        }
        sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        for(String a: list) {
            String result = "";
            for(int i = 0; i < m; i++) {
                char ch = a.charAt(i);
                result = ch + result;
            }
            System.out.println(result);
        }
    }
}

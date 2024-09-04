import java.util.Scanner;

public class questionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < ((n-i) * 2) - 2; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = n-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < ((n-i) * 2); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if(i != 1) {
                System.out.print("\n");
            }
        }
    }
}

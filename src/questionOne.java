import java.util.Scanner;
public class questionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String totalNum = sc.nextLine();
        String[] numbers = totalNum.split(" ");
        sc.close();
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        if(a > b) {
            System.out.print(">");
        } else if(a < b) {
            System.out.print("<");
        } else {
            System.out.print("==");
        }
    }
}
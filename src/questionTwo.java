import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalValue = 0;
        String totalNum = sc.nextLine();
        String[] numbers = totalNum.split(" ");
        for (String number : numbers) {
            totalValue += (int) Math.pow(Integer.parseInt(number), 2);
        }
        System.out.println(totalValue % 10);
    }
}

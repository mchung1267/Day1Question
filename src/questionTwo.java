import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalValue = 0;
        String totalNum = sc.nextLine();
        String[] numbers = totalNum.split(" ");
        for(int i = 0; i < numbers.length; i++){
            totalValue += (int) Math.pow(Integer.parseInt(numbers[i]), 2);
        }
        System.out.println(totalValue % 10);
    }
}

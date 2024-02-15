import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое количество целых чисел через пробел: ");
        String numbers = scanner.nextLine();

            String[] numberArray = numbers.split(" ");
            StringBuilder resultMsg = new StringBuilder();

            for (String number : numberArray) {
                int num = Integer.parseInt(number);
                if (num % 3 == 0) {
                    resultMsg.append(number).append(" ");
                }
            }
            System.out.println(resultMsg.toString());
            scanner.close();
    }
}

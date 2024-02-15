import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String number = scanner.nextLine();

        if (Integer.parseInt(number) > 7) {
                System.out.println("Привет");
        } 
    }
}


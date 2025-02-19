import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int secret = random.nextInt(101);
        int attemps = 0;
        Scanner scanner = new Scanner(System.in);
        int guess = -1;

        System.out.println("Угадайте число от 0 до 100:");

        do {
            System.out.print("Введите ваше число: ");

            try{
                guess = scanner.nextInt();

                if (guess < 0 || guess > 100) {
                    System.out.println("Ошибка! Число должно быть от 0 до 100. Попробуйте снова.");
                    continue;
                }

                attemps++;

                if (guess < secret) {
                    System.out.println("Твое число меньше.");
                } else if (guess > secret) {
                    System.out.println("Твое число больше.");
                } else {
                    System.out.println("Поздравляем! Вы угадали!");
                }

            } catch (Exception e) {
                System.out.println("Ошибка! Пожалуйста, введите целое число.");
                scanner.nextLine();
            }

        } while (guess != secret);

        System.out.println("Вы угадали за " + attemps + " попыток.");
        scanner.close();
    }
}
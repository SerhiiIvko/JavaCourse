package classworks.january2018.jan162018.classwork.task11;

import java.util.Scanner;

/**
 * 11.Игра Угадайка v2. Сгенерируйте число от 0 до 100:
 * 1.Поприветствуйте пользователя. Сообщите ему, что он играет против U игрока (любое имя), который имеет n (сгенерировать
 * число от 3 до 10) попыток угадать число.
 * 2.Запросите у пользователя его имя и при обращении к нему впредь используйте его.
 * 3.Пользователь имеет а (сгенерировать число от 3 до 10) попыток отгадать  число.
 * 4.Право первого хода также определить рандомно (1 – ходит юзер, 0 – U игрок).
 * 5.Ваша игра должна выглядеть подобным образом:
 * Добро пожаловать в игру «Угадайка v2». Попробуйте угадать загаданное число.
 * Сегодня вашим соперником будет Иван (U игрок). У Ивана 6 (сгенерированное n число) попыток отгадать число.
 * <p>
 * Пожалуйста введите Ваше имя: ___ (например Василий)
 * Василий, у Вас 4 попытки отгадать загаданное число.
 * Начнём игру:
 * <p>
 * Василий: ___ (например ввели 10)
 * Мало. У Вас осталось 3 попыток.
 * <p>
 * Иван: 50 (ответ U игрока генерируется разработчиком. Диапазон определяем во время игры)
 * Много. У Вас осталось 5 попыток.
 * <p>
 * Василий: ___ (например ввели 30)
 * Мало. У Вас осталось 2 попыток.
 * <p>
 * Иван: 45 (ответ u игрока генерируется разработчиком. Диапазон определяем во время игры)
 * Поздравляю! Было загадано число: 45.
 * Игрок Иван отгадал загаданное число.
 * Игрок Василий проиграл.
 * <p>
 * 6.Выигрывает игрок который первым отгадал число.
 * 7.Если у кого-то закончились попытки, второй пользователь может продолжить игру.
 * 8.Компьютер победил, если оба пользователя не отгадали число.
 */
public class Ugadaika2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerTries = (3 + (int) (Math.random() * 5));
        int botTries = (3 + (int) (Math.random() * 5));
        String botName = "Arnold";
        System.out.println("Добро пожаловать в игру «Угадайка v2». Попробуйте угадать загаданное число.\n" +
                "Сегодня вашим соперником будет " + botName + ". У него " + botTries + " попыток отгадать число.");
        System.out.print("Пожалуйста введите Ваше имя: ");
        String playerName = scanner.nextLine();
        System.out.println(playerName + ", у Вас " + playerTries + " попытoк отгадать загаданное число.");
        int secretNumber = (int) (Math.random() * 100);

        boolean isBotStroke = (int) (Math.random() * 2) == 0;
        System.out.println("Начнём игру");
        System.out.println("Первым ходит " + (isBotStroke ? botName : playerName));

        int min = 0;
        int max = 100;

        while (playerTries > 0 || botTries > 0) {
            int number;
            System.out.println((isBotStroke ? botName : playerName) + ", введите число: ");
            if (isBotStroke && botTries > 0) {
                botTries--;
                number = (min + (int) (Math.random() * (max - min)));
                System.out.println(number);
            } else if (playerTries > 0) {
                playerTries--;
                number = scanner.nextInt();
                if (number < 0 || number > 100) {
                    System.out.println("Incorrect input");
                }
            } else {
                break;
            }
            if (number == secretNumber) {
                System.out.println((isBotStroke ? botName : playerName) +
                        ", ты отгадал загаданное число и победил! Поздравляю! Загаданное число было " + secretNumber + ". " +
                        (!isBotStroke ? botName : playerName) + " проиграл.");
                return;
            } else if (number < secretNumber) {
                min = Math.max(min, number + 1);
                System.out.println((isBotStroke ? botName : playerName) + ", маловато!");
            } else if (number > secretNumber) {
                max = Math.min(max, number - 1);
                System.out.println((isBotStroke ? botName : playerName) + ", многовато!");
            }
            System.out.println((isBotStroke ? botTries == 0 : playerTries == 0) ?
                    "У вас не осталось попыток." :
                    "Оставшихся попыток: " + (isBotStroke ? botTries : playerTries) + ".");
            isBotStroke = (playerTries == 0) || (botTries != 0 && !isBotStroke);
        }
        scanner.close();
        System.out.println(playerName + " и " + botName + " оба проиграли. Комп вас сделал! Загаданное число " + secretNumber);
    }
}
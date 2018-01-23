package classworks.jan162018.classwork.task11;

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
        int botTries = (int) (3 + (Math.random() * 7));
        String botName = "Arnold";
        System.out.println("Добро пожаловать в игру «Угадайка v2». Попробуйте угадать загаданное число.\n" +
                "Сегодня вашим соперником будет " + botName + ". У него " + botTries + " попыток отгадать число.");
        System.out.print("Пожалуйста введите Ваше имя: ");
        String playerName = scanner.nextLine();
        int playerTries = (int) (3 + (Math.random() * 7));
        System.out.println(playerName + ", у Вас " + playerTries + " попытoк отгадать загаданное число.");
        int firstStroke = (int) (Math.random() * 2);
        int secret = (int) (Math.random() * 100);
        System.out.println("Начнём игру");

        System.out.println(firstStroke == 1 ? "Первым ходит " + playerName : "Первым ходит " + botName);

        int userTry = 0;
        int number1;
        int botTry = 0;
        int number2;

        if (firstStroke == 1) {
            while (userTry < playerTries || botTry < botTries) {
                System.out.println(playerName + ", введите число: ");
                number1 = scanner.nextInt();
                number2 = (int) (Math.random() * 100);
                System.out.println(botName + " вводит " + number2);
                playerTries--;
                botTries--;
                if (playerTries == 0 || botTries == 0) {
                    System.out.println(playerName + " выбывает, у него закончились попытки.");
                }
                if (number1 < secret) {
                    System.out.println(playerName + ", маловато! У вас осталось " + playerTries + " попыток.");

                } else if (number1 > secret) {
                    System.out.println(playerName + ", многовато! У вас осталось " + playerTries + " попыток");
                } else if (number1 == secret) {
                    System.out.println(playerName + ", ты победил! Загаданное число было " + secret);
                    return;
                } else {
                    System.out.println(playerName + ", ты проиграл!");
                    return;
                }
                if (number2 < secret) {
                    System.out.println(botName + ", маловато! У вас осталось " + botTries + " попыток");

                } else if (number2 > secret) {
                    System.out.println(botName + ", многовато! У вас осталось " + botTries + " попыток");
                    number2 = (int) (secret + (Math.random() * number2));
                } else if (number2 == secret) {
                    System.out.println(botName + ", ты победил! Загаданное число было " + secret);
                    return;
                } else {
                    System.out.println(botName + ", ты проиграл!");
                    return;
                }
                userTry++;
                botTry++;
            }
        } else {
            while (userTry < playerTries || botTry < botTries) {
                number2 = (int) (Math.random() * 100);
                System.out.println("Игрок " + botName + " вводит число " + number2);
                System.out.println("Игрок " + playerName + ", введите число:");
                number1 = scanner.nextInt();
                botTries--;
                playerTries--;
                if (number2 < secret) {
                    System.out.println(botName + ", маловато! У вас осталось " + botTries + " попыток.");
                } else if (number2 > secret) {
                    System.out.println(botName + ", многовато! У вас осталось " + botTries + " попыток.");
                    number2 = (int) (secret + (Math.random() * number2));
                } else if (number2 == secret) {
                    System.out.println(botName + ", ты победил! Загаданное число было " + secret);
                    return;
                } else {
                    System.out.println(botName + ", ты проиграл!");
                    return;
                }
                if (number1 < secret) {
                    System.out.println(playerName + ", маловато! У вас осталось " + playerTries + " попыток.");
                } else if (number1 > secret) {
                    System.out.println(playerName + ", многовато! У вас осталось " + playerTries + " попыток.");
                } else if (number1 == secret) {
                    System.out.println(playerName + ", ты победил! Загаданное число было " + secret);
                    return;
                } else {
                    System.out.println(playerName + ", ты проиграл!");
                    return;
                }
                userTry++;
                botTry++;
            }
        }
        scanner.close();
        System.out.println(playerName + " и " + botName + " оба програли. Комп вас сделал! Загаданное число " + secret);
    }
}

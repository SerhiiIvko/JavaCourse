package classworks.jan162018.homework;

import java.util.Scanner;

public class Ugadaika2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int botTries = (3 + (int) (Math.random() * 5));
        String botName = "Arnold";
        System.out.println("Добро пожаловать в игру «Угадайка v2». Попробуйте угадать загаданное число.\n" +
                "Сегодня вашим соперником будет " + botName + ". У него " + botTries + " попыток отгадать число.");
        System.out.print("Пожалуйста введите Ваше имя: ");
        String playerName = scanner.nextLine();
        int playerTries = (3 + (int) (Math.random() * 5));
        System.out.println(playerName + ", у Вас " + playerTries + " попытoк отгадать загаданное число.");
        int secretNumber = (int) (Math.random() * 100);
        int firstStroke = (int) (Math.random() * 2);

        System.out.println("Начнём игру");

        System.out.println(firstStroke == 1 ? "Первым ходит " + playerName : "Первым ходит " + botName);

        int numberOfUser = 0;
        int numberOfBot = (int) (Math.random() * 100);

        if (firstStroke == 1) {
            while (playerTries > 0 && botTries > 0) {

                if (playerTries > 0) {
                    System.out.println(playerName + ", введите число: ");
                    numberOfUser = scanner.nextInt();
                    if (numberOfUser < 0 || numberOfUser > 100) {
                        System.out.println("Incorrect input");
                    }
                    playerTries--;
                    if (numberOfUser < secretNumber) {
                        System.out.println(playerName + ", маловато! У вас осталось " + playerTries + " попыток.");
                    } else if (numberOfUser > secretNumber) {
                        System.out.println(playerName + ", многовато! У вас осталось " + playerTries + " попыток");
                    } else if (numberOfUser == secretNumber) {
                        System.out.println(playerName + ", ты победил! Загаданное число было " + secretNumber);
                        return;
                    } else {
                        System.out.println(playerName + ", ты проиграл!");
                        return;
                    }
                }
                if (playerTries == 0) {
                    System.out.println(playerName + " выбывает, у него закончились попытки.");
                    break;
                }

                if (botTries > 0) {
                    System.out.println(botName + " вводит " + numberOfBot);
                    botTries--;
                    if (numberOfBot < secretNumber) {
                        System.out.println(botName + ", маловато! У вас осталось " + botTries + " попыток");
                        if (numberOfUser < secretNumber && numberOfBot < secretNumber) {
                            numberOfBot = (int) ((Math.random() * (100 - numberOfBot)) + numberOfBot);
                        } else {
                            numberOfBot = (int) ((Math.random() * (100 - numberOfUser)) + numberOfUser);
                        }
                    } else if (numberOfBot > secretNumber) {
                        System.out.println(botName + ", многовато! У вас осталось " + botTries + " попыток");
                        if (numberOfBot > secretNumber && numberOfUser > secretNumber) {
                            numberOfBot = (int) ((Math.random() * (numberOfBot - secretNumber)) + secretNumber);
                        } else {
                            numberOfBot = (int) ((Math.random() * (numberOfUser - secretNumber)) + secretNumber);
                        }
                    } else if (numberOfBot == secretNumber) {
                        System.out.println(botName + ", ты победил! Загаданное число было " + secretNumber);
                        return;
                    } else {
                        System.out.println(botName + ", ты проиграл!");
                        return;
                    }
                }
                if (botTries == 0) {
                    System.out.println(botName + " выбывает, у него закончились попытки.");
                    break;
                }
            }
        } else {
            while (playerTries > 0 && botTries > 0) {
                if (botTries > 0) {
                    System.out.println(botName + " вводит " + numberOfBot);
                    botTries--;
                    if (numberOfBot < secretNumber) {
                        System.out.println(botName + ", маловато! У вас осталось " + botTries + " попыток");
                        if (numberOfBot < secretNumber && numberOfUser < secretNumber) {
                            if (numberOfBot <= numberOfUser) {
                                numberOfBot = (int) ((Math.random() * (100 - numberOfBot)) + numberOfBot);
                            } else {
                                numberOfBot = (int) ((Math.random() * (100 - numberOfUser)) + numberOfUser);
                            }
                        }
                    } else if (numberOfBot > secretNumber) {
                        System.out.println(botName + ", многовато! У вас осталось " + botTries + " попыток");
                        if (numberOfBot > secretNumber && numberOfUser > secretNumber) {
                            if (numberOfBot >= numberOfUser) {
                                numberOfBot = (int) (Math.random() * (numberOfBot));
                            } else {
                                numberOfBot = (int) (Math.random() * (numberOfUser));
                            }
                        }
                    } else if (numberOfBot == secretNumber) {
                        System.out.println(botName + ", ты победил! Загаданное число было " + secretNumber);
                        return;
                    } else {
                        System.out.println(botName + ", ты проиграл!");
                        return;
                    }
                }
                if (botTries == 0) {
                    System.out.println(botName + " выбывает, у него закончились попытки.");
                    break;
                }
                if (playerTries > 0) {
                    System.out.println("Игрок " + playerName + ", введите число:");
                    numberOfUser = scanner.nextInt();
                    if (numberOfUser < 0 || numberOfUser > 100) {
                        System.out.println("Incorrect input");
                    }
                    playerTries--;
                    if (numberOfUser < secretNumber) {
                        System.out.println(playerName + ", маловато! У вас осталось " + playerTries + " попыток.");
                    } else if (numberOfUser > secretNumber) {
                        System.out.println(playerName + ", многовато! У вас осталось " + playerTries + " попыток.");
                    } else if (numberOfUser == secretNumber) {
                        System.out.println(playerName + ", ты победил! Загаданное число было " + secretNumber);
                        return;
                    } else {
                        System.out.println(playerName + ", ты проиграл!");
                        return;
                    }
                }
                if (playerTries == 0) {
                    System.out.println(playerName + " выбывает, у него закончились попытки.");
                    break;
                }
            }
        }
        scanner.close();
        if (botTries == 0 && playerTries == 0) {
            System.out.println(playerName + " и " + botName + " оба проиграли. Комп вас сделал! Загаданное число " + secretNumber);
        }
    }
}
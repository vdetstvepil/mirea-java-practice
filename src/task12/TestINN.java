package task12;

import java.util.Scanner;

public class TestINN {
    // Функция main.
    public static void main(String[] args) {
        // Инициализируем переменную ввода.
        Scanner scanner = new Scanner(System.in);

        // Ввод ФИО.
        System.out.print("FIO: ");
        String name = scanner.nextLine();

        while (true) {
            // Ввод ИНН.
            System.out.print("INN: ");
            String INN = scanner.nextLine();
            try {
                // Проверяем, корректен ли ИНН. Если ИНН корректен,
                // программа пойдет дальше и не выбросит ошибку.
                checkINN(INN);

                // Выходим из цикла.
                System.out.println("Valid");
                return;
            } catch (INNException ex) {
                // Выводим на экран ошибку.
                System.out.println("Not valid");
                System.out.println(ex.toString());
                System.out.println("Try again");
            }
        }
    }

    static void checkINN(String INN) throws INNException {
        // Неверная длина ИНН.
        if (INN.length() != 12)
            throw new INNException("Incorrect count of numbers.");
        // ИНН содержит символы, не являющиеся цифрами.
        else
            for (int i = 0; i < INN.length(); i++)
                if ((int)INN.charAt(i) < 48 || (int)INN.charAt(i) > 57)
                    throw new INNException("Incorrect symbols.");
    }
}
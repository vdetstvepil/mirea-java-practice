package task7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Переменная ввода данных с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cards of players with spaces:");

        // Ввод колоды первого игрока.
        System.out.print("  player 1 -> ");
        String[] first = scanner.nextLine().split(" ");

        // Ввод колоды второго игрока.
        System.out.print("  player 2 -> ");
        String[] second = scanner.nextLine().split(" ");

        // Выводим результаты тестирования для различных коллекций.
        System.out.println("\nTesting:");
        System.out.println("  [Stack] -> " + StackSolution.getWinner(first, second));
        System.out.println("  [Queue] -> " + QueueSolution.getWinner(first, second));
        System.out.println("  [Dequeue] -> " + DequeSolution.getWinner(first, second));
        System.out.println("  [DoubleList] -> " + DoubleListSolution.getWinner(first, second));
    }
}

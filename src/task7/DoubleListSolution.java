package task7;

import java.util.LinkedList;

public class DoubleListSolution {
    // Переменные колод карт первого и второго игроков.
    private static LinkedList<Integer> firstPlayerDeck;
    private static LinkedList<Integer> secondPlayerDeck;

    // Метод определения победителя в игре.
    public static String getWinner(String[] firstPlayerDeck, String[] secondPlayerDeck) {
        // Инициализация переменных.
        DoubleListSolution.firstPlayerDeck = new LinkedList<>();
        DoubleListSolution.secondPlayerDeck = new LinkedList<>();

        // Заносим данные о колодах в соответствующие коллекции.
        for (int i = 0; i < 5; i++) {
            DoubleListSolution.firstPlayerDeck.add(Integer.parseInt(firstPlayerDeck[i]));
            DoubleListSolution.secondPlayerDeck.add(Integer.parseInt(secondPlayerDeck[i]));
        }

        for (int i = 0; i < 106; i++) {
            // Если у первого игрока закончились карты, то второй
            // победил. Если у второго игрока закончились карты, то
            // первый победил. В противном случае берется старшая карта.
            if (DoubleListSolution.firstPlayerDeck.size() == 0)
                return "second " + i;
            else if (DoubleListSolution.secondPlayerDeck.size() == 0)
                return "first " + i;
            else {
                // Вынимаем карты из колод игроков.
                int firstCard = DoubleListSolution.firstPlayerDeck.remove();
                int secondCard = DoubleListSolution.secondPlayerDeck.remove();

                // Проверяем, побеждает ли карта "0" карту "9".
                // В противном случае побеждает старшая карта.
                if (firstCard == 0 && secondCard == 9) {
                    DoubleListSolution.firstPlayerDeck.add(firstCard);
                    DoubleListSolution.firstPlayerDeck.add(secondCard);
                }
                else if (secondCard == 0 && firstCard == 9) {
                    DoubleListSolution.secondPlayerDeck.add(firstCard);
                    DoubleListSolution.secondPlayerDeck.add(secondCard);
                }
                else if (firstCard > secondCard) {
                    DoubleListSolution.firstPlayerDeck.add(firstCard);
                    DoubleListSolution.firstPlayerDeck.add(secondCard);
                }
                else {
                    DoubleListSolution.secondPlayerDeck.add(firstCard);
                    DoubleListSolution.secondPlayerDeck.add(secondCard);
                }
            }
        }

        // Если после 106 итераций победитель так и не был определен,
        // возвращаем слово "botva".
        return "botva";
    }
}

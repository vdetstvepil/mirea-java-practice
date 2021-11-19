package task7;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSolution {
    // Переменные колод карт первого и второго игроков.
    private static Queue<Integer> firstPlayerDeck;
    private static Queue<Integer> secondPlayerDeck;

    // Метод определения победителя в игре.
    public static String getWinner(String[] firstPlayerDeck, String[] secondPlayerDeck) {
        // Инициализация переменных.
        QueueSolution.firstPlayerDeck = new LinkedList<>();
        QueueSolution.secondPlayerDeck = new LinkedList<>();

        // Заносим данные о колодах в соответствующие коллекции.
        for (int i = 0; i < 5; i++) {
            QueueSolution.firstPlayerDeck.add(Integer.parseInt(firstPlayerDeck[i]));
            QueueSolution.secondPlayerDeck.add(Integer.parseInt(secondPlayerDeck[i]));
        }

        for (int i = 0; i < 106; i++) {
            // Если у первого игрока закончились карты, то второй
            // победил. Если у второго игрока закончились карты, то
            // первый победил. В противном случае берется старшая карта.
            if (QueueSolution.firstPlayerDeck.size() == 0)
                return "second " + i;
            else if (QueueSolution.secondPlayerDeck.size() == 0)
                return "first " + i;
            else {
                // Вынимаем карты из колод игроков.
                int firstCard = QueueSolution.firstPlayerDeck.remove();
                int secondCard = QueueSolution.secondPlayerDeck.remove();

                // Проверяем, побеждает ли карта "0" карту "9".
                // В противном случае побеждает старшая карта.
                if (firstCard == 0 && secondCard == 9) {
                    QueueSolution.firstPlayerDeck.add(firstCard);
                    QueueSolution.firstPlayerDeck.add(secondCard);
                }
                else if (secondCard == 0 && firstCard == 9){
                    QueueSolution.secondPlayerDeck.add(firstCard);
                    QueueSolution.secondPlayerDeck.add(secondCard);
                }
                else if(firstCard > secondCard){
                    QueueSolution.firstPlayerDeck.add(firstCard);
                    QueueSolution.firstPlayerDeck.add(secondCard);
                }
                else {
                    QueueSolution.secondPlayerDeck.add(firstCard);
                    QueueSolution.secondPlayerDeck.add(secondCard);
                }
            }
        }

        // Если после 106 итераций победитель так и не был определен,
        // возвращаем слово "botva".
        return "botva";
    }
}

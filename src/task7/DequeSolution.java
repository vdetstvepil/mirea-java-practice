package task7;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeSolution {
    // Переменные колод карт первого и второго игроков.
    private static Deque<Integer> firstPlayerDeck;
    private static Deque<Integer> secondPlayerDeck;

    // Метод определения победителя в игре.
    public static String getWinner(String[] firstPlayerDeck, String[] secondPlayerDeck) {
        // Инициализация переменных.
        DequeSolution.firstPlayerDeck = new ArrayDeque<>();
        DequeSolution.secondPlayerDeck = new ArrayDeque<>();

        // Заносим данные о колодах в соответствующие коллекции.
        for (int i = 0; i < 5; i++) {
            DequeSolution.firstPlayerDeck.add(Integer.parseInt(firstPlayerDeck[i]));
            DequeSolution.secondPlayerDeck.add(Integer.parseInt(secondPlayerDeck[i]));
        }

        for (int i = 0; i < 106; i++) {
            // Если у первого игрока закончились карты, то второй
            // победил. Если у второго игрока закончились карты, то
            // первый победил. В противном случае берется старшая карта.
            if (DequeSolution.firstPlayerDeck.size() == 0)
                return "second "+i;
            else if (DequeSolution.secondPlayerDeck.size()== 0)
                return "first "+i;
            else {
                // Вынимаем карты из колод игроков.
                int firstCard = DequeSolution.firstPlayerDeck.remove();
                int secondCard = DequeSolution.secondPlayerDeck.remove();

                // Проверяем, побеждает ли карта "0" карту "9".
                // В противном случае побеждает старшая карта.
                if (firstCard == 0 && secondCard == 9) {
                    DequeSolution.firstPlayerDeck.add(firstCard);
                    DequeSolution.firstPlayerDeck.add(secondCard);
                }
                else if (secondCard == 0 && firstCard == 9){
                    DequeSolution.secondPlayerDeck.add(firstCard);
                    DequeSolution.secondPlayerDeck.add(secondCard);
                }
                else if(firstCard > secondCard){
                    DequeSolution.firstPlayerDeck.add(firstCard);
                    DequeSolution.firstPlayerDeck.add(secondCard);
                }
                else {
                    DequeSolution.secondPlayerDeck.add(firstCard);
                    DequeSolution.secondPlayerDeck.add(secondCard);
                }
            }
        }

        // Если после 106 итераций победитель так и не был определен,
        // возвращаем слово "botva".
        return "botva";
    }
}

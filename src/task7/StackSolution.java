package task7;

import java.util.Stack;

public class StackSolution {
    // Переменные колод карт первого и второго игроков.
    private static Stack<Integer> firstPlayerDeck;
    private static Stack<Integer> secondPlayerDeck;

    // Метод определения победителя в игре.
    public static String getWinner(String[] firstPlayerDeck, String[] secondPlayerDeck) {
        // Инициализация переменных.
        StackSolution.firstPlayerDeck = new Stack<>();
        StackSolution.secondPlayerDeck = new Stack<>();

        // Заносим данные о колодах в соответствующие коллекции.
        for (int i = 4; i >= 0; i--) {
            StackSolution.firstPlayerDeck.add(Integer.parseInt(firstPlayerDeck[i]));
            StackSolution.secondPlayerDeck.add(Integer.parseInt(secondPlayerDeck[i]));
        }

        for (int i = 0; i < 106; i++) {
            // Если у первого игрока закончились карты, то второй
            // победил. Если у второго игрока закончились карты, то
            // первый победил. В противном случае берется старшая карта.
            if (StackSolution.firstPlayerDeck.size() == 0)
                return "second " + i;
            else if (StackSolution.secondPlayerDeck.size() == 0)
                return "first " + i;
            else {
                // Вынимаем карты из колод игроков.
                int firstCard = StackSolution.firstPlayerDeck.pop();
                int secondCard = StackSolution.secondPlayerDeck.pop();

                // Проверяем, побеждает ли карта "0" карту "9".
                // В противном случае побеждает старшая карта.
                if (firstCard == 0 && secondCard == 9){
                    StackSolution.firstPlayerDeck.add(0, firstCard);
                    StackSolution.firstPlayerDeck.add(0, secondCard);
                }
                else if (secondCard == 0 && firstCard == 9){
                    StackSolution.secondPlayerDeck.add(0, firstCard);
                    StackSolution.secondPlayerDeck.add(0, secondCard);
                }
                else if(firstCard > secondCard){
                    StackSolution.firstPlayerDeck.add(0, firstCard);
                    StackSolution.firstPlayerDeck.add(0, secondCard);
                }
                else {
                    StackSolution.secondPlayerDeck.add(0, firstCard);
                    StackSolution.secondPlayerDeck.add(0, secondCard);
                }
            }
        }

        // Если после 106 итераций победитель так и не был определен,
        // возвращаем слово "botva".
        return "botva";
    }
}

//10. Разворот числа
//Дано число n, десятичная запись которого не содержит нулей. Получите число, записанное теми же цифрами, но в противоположном порядке.


package task5;

public class Task10 {
    public static int recursion(int n, int a) {
        if (n == 0) {
            return a;
        }
        else {
            return recursion(n / 10, 10 * a + n % 10);
        }
    }

    public static void main(String[] args) {
        // Вызываем.
        System.out.println(recursion(123456789, 0));
    }
}



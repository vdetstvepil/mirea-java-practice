//11. Количество единиц
//Дана последовательность натуральных чисел (одно число в строке), завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой последовательности встречается число 1. Числа, идущие после двух нулей, необходимо игнорировать.


package task5;

import java.util.Scanner;

class Task11 {
    public static int recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return recursion() + n + m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return recursion() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return recursion() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}



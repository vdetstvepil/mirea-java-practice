//11. Количество единиц
//Дана последовательность натуральных чисел (одно число в строке), завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой последовательности встречается число 1. Числа, идущие после двух нулей, необходимо игнорировать.


package task5;

import java.util.Scanner;

class Task12 {
    public static void function(String n) {
        if (n.length() == 0) return;
        if (Integer.parseInt(String.valueOf(n.charAt(0))) % 2 == 1)
            System.out.println(n.charAt(0) + " ");
        function(n.substring(1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        function(n);
    }
}



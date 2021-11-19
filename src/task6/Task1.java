package task6;

// Задание 1.
// Задача сортировки вставками.
public class Task1 {
    // Массив объектов класса Student.
    Student[] students = new Student[5];

    // Конструктор без параметров.
    public Task1() {
        // Генерируем рандомные ID'шники для студентов.
        for (int i = 0; i < 5; i++)
            students[i] = new Student((int)(Math.random() * 999));

        // Выводим массив на экран.
        System.out.println("Random generated students:");
        for (Student temp : students)
            System.out.print(temp.getIDNumber() + " ");
        System.out.println("\n");

        // Сортируем вставками массив, делаем проход через
        // цикл в цикле с двух сторон.
        for (int i = 1; i < 5; i++)
            for (int j = i; j > 0; j--)
                if (students[j].getIDNumber() < students[j - 1].getIDNumber()) {
                    // Обмен значениями между двумя ячейками.
                    Student tmp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = tmp;
                }

        // Выводим результат на экран.
        System.out.println("Sorted array of students:");
        for (Student temp : students)
            System.out.print(temp.getIDNumber() + " ");
        System.out.println("\n");
    }
}

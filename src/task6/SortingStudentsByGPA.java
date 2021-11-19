package task6;

// Задание 2. Реализация интерфейса Comparator.
public class SortingStudentsByGPA implements Comparator{
    // Массив объектов класса Student.
    Student students[] = new Student[10];

    // Конструктор без параметров.
    public SortingStudentsByGPA() {
        // Генерируем рандомные ID'шники для студентов.
        for (int i = 0; i < 10; i++)
            students[i] = new Student(i, (int)(Math.random() * 10));

        // Вывод массива на экран.
        System.out.println("Random generated students:");
        for (Student i : students)
            System.out.print(i.getGPA() + " ");
        System.out.println("\n");

        // Быстрая сортировка массива.
        Comparator.sort(students,0,9);

        // Вывод результата на экран.
        System.out.println("Sorted array of students:");
        for (Student i : students)
            System.out.print(i.getGPA() + " ");
        System.out.println("\n");
    }
}

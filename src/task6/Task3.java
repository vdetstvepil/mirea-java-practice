package task6;

// Задание 3. Слияние списков.
public class Task3{
    // Метод вывода массива на экран.
    void printStudents(Student[] students) {
        for (Student student : students)
            System.out.print(student.getIDNumber() + " ");
        System.out.println("\n");
    }

    // Конструктор без параметров.
    public Task3()
    {
        // Инициализация двух массивов студентов.
        Student[] students1 = new Student[10];
        Student[] students2 = new Student[10];

        // Инициализация результирующего массива.
        Student[] result = new Student[20];

        // Генерирование рандомных ID'шников студентов.
        for (int i = 0; i < 10; i++)
        {
            students1[i] = new Student((int) (Math.random() * 999));
            students2[i] = new Student((int) (Math.random() * 999));
        }

        // Выводим на экран массив.
        System.out.println("Random arrays of students (1 and 2):");
        printStudents(students1);
        printStudents(students2);

        // Выполняем сортировку и слияние массивов.
        mergeArrays(students1, students2, result,10,10);
        mergeSort(result,20);

        // Выводим результат на экран.
        printStudents(result);
    }

    // Метод слияния массивов.
    public static void mergeArrays(Student[] leftStudents,
                                   Student[] rightStudents,
                                   Student[] result,
                                   int left, int right) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right)
            if (leftStudents[i].getIDNumber()
                    <= rightStudents[j].getIDNumber())
                result[k++] = leftStudents[i++];
            else
                result[k++] = rightStudents[j++];

        while (i < left)
            result[k++] = leftStudents[i++];
        while (j < right)
            result[k++] = rightStudents[j++];
    }

    // Метод слияния-сортировки массива.
    public static void mergeSort(Student[] result, int n) {
        // Если нечего сортировать, прерываем выполнение
        // функции.
        if (n <= 1)
            return;

        // Средний опорный элемент.
        int m = n / 2;

        // Вспомогательные массивы по левую и правую сторону основного.
        Student[] leftStudents = new Student[m];
        Student[] rightStudents = new Student[n - m];

        for (int i = 0; i < m; i++)
            leftStudents[i] = result[i];

        for (int i = m; i < n; i++)
            rightStudents[i - m] = result[i];

        // Проводим рекурсивную сортировку для левого и правого массива.
        mergeSort(leftStudents, m);
        mergeSort(rightStudents, n - m);

        // Выполняем слияние массивов.
        mergeArrays(result, leftStudents, rightStudents, m, n - m);
    }
}
package task6;

public interface Comparator {
    public static void sort(Student[] students, int low, int high) {
        // В случае, когда длина массива равняется 0,
        // прерываем выполнение функции.
        if (students.length == 0)
            return;

        // В случае, когда низший поро совпадает с высшим,
        // функция становится бесполезной - прерываем выполнение.
        if (low >= high)
            return;

        // Выпираем ключевой опорный элемент
        // на основе среднего в массиве.
        int m = low + (high - low) / 2;
        int temp = students[m].getGPA();

        // Примем индекс i за массив, который меньше
        // ключевого опорного элемента, а индекс j -
        // за массив, который больше опорного элемента.
        int i = low;
        int j = high;

        // Выполняем сортировку по убыванию студентов.
        while (i <= j) {
            while (students[i].getGPA() > temp)
                i++;

            while (students[j].getGPA() < temp)
                j--;

            // Меняем элементы местами.
            if (i <= j) {
                Student s = students[i];
                students[i] = students[j];
                students[j] = s;

                // Инкрементируем индекс i
                // и декрементируем индекс j.
                i++;
                j--;
            }
        }

        // Последовательно рекурсивно выполняем для левого массива
        // и правого массива соответствующую быструю сортировку.
        if (low < j)
            sort(students, low, j);
        if (high > i)
            sort(students, i, high);
    }
}

package task6;

public class Student{
    // ID студента.
    private int iDNumber;

    // Итоговый средний балл студента.
    private int GPA;

    // Параметризированный конструктор.
    public Student (int id) {
        this.iDNumber = id;
    }

    // Параметризированный конструктор.
    public Student(int id,int mark) {
        this.iDNumber = id;
        this.GPA = mark;
    }

    // Метод получения оценки.
    public int getGPA() {
        return GPA;
    }

    // Метод получения ID.
    public int getIDNumber() {
        return iDNumber;
    }
}
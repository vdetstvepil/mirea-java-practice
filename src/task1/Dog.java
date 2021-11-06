package task1;

public class Dog {
    private String name;
    private int age;

    // Конструктор с параметром имени и возраста на вход.
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Конструктор с параметром имени на вход.
    public Dog(String name) {
        this.name = name;
    }

    // Конструктор без параметров.
    public Dog() {
        this.name = "Pup";
        this.age = 0;
    }

    // Свойство - изменение возраста.
    public void setAge(int age) {
        this.age = age;
    }

    // Свойство - изменение имени.
    public void setName(String name) {
        this.name = name;
    }

    // Свойство - получение возраста.
    public int getAge() {
        return age;
    }

    // Метод toString().
    public String toString() {
        return this.name + ", age " + this.age;
    }

    // Перевод возраста собаки в человеческий.
    public void intoHumanAge() {
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }
}

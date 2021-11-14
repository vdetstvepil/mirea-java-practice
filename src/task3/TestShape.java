package task3;

public class TestShape {

    public static void main(String[] args) {
        // Инициализация переменной s1 класса Circle и приведение
        // к классу Shape.
        Shape s1 = new Circle(5.5, "RED", false);

        // Вывод на экран объекта.
        System.out.println(s1);

        // Вывод площади объекта.
        System.out.println(s1.getArea());

        // Вывод периметра объекта
        System.out.println(s1.getPerimeter());

        // Вывод цвета объекта.
        System.out.println(s1.getColor());

        // Вывод заливки объекта.
        System.out.println(s1.isFilled());

        // Вывод радиуса объекта.
        // [!] Выдает ошибку компиляции из-за того, что
        // в классе Shape нет такого метода.
        // System.out.println(s1.getRadius());


        // Инициализация переменной c1 класса Circle
        // и приведение переменной s1 к классу Circle.
        Circle c1 = (Circle)s1; // Downcast back to Circle

        // Вывод на экран объекта.
        System.out.println(c1);

        // Вывод площади объекта.
        System.out.println(c1.getArea());

        // Вывод периметра объекта.
        System.out.println(c1.getPerimeter());

        // Вывод цвета объекта.
        System.out.println(c1.getColor());

        // Вывод заливки объекта.
        System.out.println(c1.isFilled());

        // Вывод радиуса объекта.
        System.out.println(c1.getRadius());


        // Инициализация переменной s2 класса Shape.
        // [!] Выдает ошибку компиляции из-за того,
        // что нельзя инициализировать объект абстрактного
        // класса.
        //Shape s2 = new Shape();


        // Инициализация переменной s3 класса Shape
        // новым объектом класса Rectangle.
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);

        // Вывод на экран объекта.
        System.out.println(s3);

        // Вывод площади объекта.
        System.out.println(s3.getArea());

        // Вывод периметра объекта.
        System.out.println(s3.getPerimeter());

        // Вывод цвета объекта.
        System.out.println(s3.getColor());

        // Вывод длины объекта.
        // [!] Выдает ошибку компиляции из-за того,
        // что такого метода в классе Shape не существует.
        //System.out.println(s3.getLength());


        // Инициализация переменной r1 класса Rectangle
        // и приведение переменной s3 к классу Rectangle.
        Rectangle r1 = (Rectangle)s3;

        // Вывод на экран объекта.
        System.out.println(r1);

        // Вывод площади объекта.
        System.out.println(r1.getArea());

        // Вывод цвета объекта.
        System.out.println(r1.getColor());

        // Вывод длины объекта.
        System.out.println(r1.getLength());


        // Инициализация переменной s4 класса Shape
        // новым объектом класса Square.
        Shape s4 = new Square(6.6);

        // Вывод на экран объекта.
        System.out.println(s4);

        // Вывод площади объекта.
        System.out.println(s4.getArea());

        // Вывод цвета объекта.
        System.out.println(s4.getColor());

        // Вывод стороны объекта.
        // [!] Выдает ошибку компиляции из-за того,
        // что такого метода в классе Shape не существует.
        //System.out.println(s4.getSide());


        // Инициализация переменной r2 класса Rectangle
        // и приведение переменной s4 к классу Rectangle.
        Rectangle r2 = (Rectangle)s4;

        // Вывод объекта на экран.
        System.out.println(r2);

        // Вывод площади объекта.
        System.out.println(r2.getArea());

        // Вывод цвета объекта.
        System.out.println(r2.getColor());

        // Вывод стороны объекта.
        // [!] Выдает ошибку компиляции из-за того,
        // что такого метода в классе Rectangle не существует.
        //System.out.println(r2.getSide());

        // Вывод длины объекта.
        System.out.println(r2.getLength());


        // Инициализация переменной sq1 класса Square
        // и приведение переменной r2 к классу Square.
        Square sq1 = (Square)r2;

        // Вывод объекта на экран.
        System.out.println(sq1);

        // Вывод площади объекта.
        System.out.println(sq1.getArea());

        // Вывод цвета объекта.
        System.out.println(sq1.getColor());

        // Вывод стороны объекта.
        System.out.println(sq1.getSide());

        // Вывод длины объекта.
        System.out.println(sq1.getLength());
    }
}

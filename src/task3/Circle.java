package task3;

public class Circle extends Shape{
    // Поля.
    protected double radius;

    // Конструктор.
    public Circle() {

    }

    // Параметризированный конструктор.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Параметризированный конструктор.
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Свойство get для поля radius.
    public double getRadius() {
        return radius;
    }

    // Свойство set для поля radius.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Переопределенный получения площади.
    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    // Переопределенный получения периметра.
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Переопределенный метод преобразования объекта в строку.
    @Override
    public String toString() {
        return "Circle" +
                "  radius = " + radius +
                "  color = " + color +
                "  filled = " + filled;
    }
}

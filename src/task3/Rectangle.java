package task3;

public class Rectangle extends Shape{
    // Поля.
    protected double width;
    protected double length;

    // Конструктор.
    public Rectangle() {

    }

    // Параметризированный конструктор.
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Параметризированный конструктор.
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Свойство get для поля width.
    public double getWidth() {
        return width;
    }

    // Свойство set для поля width.
    public void setWidth(double width) {
        this.width = width;
    }

    // Свойство get для поля length.
    public double getLength() {
        return length;
    }

    // Свойство set для поля length.
    public void setLength(double length) {
        this.length = length;
    }

    // Переопределенный получения площади.
    @Override
    public double getArea() {
        return length * width;
    }

    // Переопределенный получения периметра.
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Переопределенный метод преобразования объекта в строку.
    @Override
    public String toString() {
       return "Rectangle" +
                "  width = " + width +
                "  length = " + length +
                "  color = " + color +
                "  filled = " + filled;
    }
}

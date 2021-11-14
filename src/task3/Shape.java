package task3;

public abstract class Shape {
    // Поля.
    protected String color;
    protected boolean filled;

    // Конструктор.
    public Shape() {

    }

    // Параметризированный конструктор.
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Свойство get для поля color.
    public String getColor() {
        return color;
    }

    // Свойство set для поля color.
    public void setColor(String color) {
        this.color = color;
    }

    // Свойство get для поля filled.
    public boolean isFilled() {
        return filled;
    }

    // Свойство set для поля filled.
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Метод получения площади.
    public abstract double getArea();

    // Метод получения периметра.
    public abstract double getPerimeter();

    // Переопределенный метод преобразования объекта в строку.
    @Override
    public String toString() {
        return "Shape" +
                "  color = " + color +
                "  filled = " + filled;
    }
}

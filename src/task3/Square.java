package task3;

public class Square extends Rectangle{
    // Конструктор.
    public Square() {

    }

    // Параметризированный конструктор.
    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    // Параметризированный конструктор.
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Свойство get для поля width.
    public double getSide() {
        return width;
    }

    // Метод set для поля width и length.
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Свойство set для поля length.
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    // Свойство set для поля width.
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    // Переопределенный метод преобразования объекта в строку.
    @Override
    public String toString() {
       return "Square" +
                "  side = " + width +
                "  color = " + color +
                "  filled = " + filled;
    }
}

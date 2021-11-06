package task1;

public class Ball {
    private String model;
    private String color;
    private double radius;

    // Конструктор с параметрами.
    public Ball(String model, String color, double radius) {
        this.model = model;
        this.color = color;
        this.radius = radius;
    }

    // Конструктор без параметров.
    public Ball() {
        this.model = "Basic ball";
        this.color = "Gray";
        this.radius = 6.7;
    }

    // Свойство - изменение модели.
    public void setModel(String temp) {
        this.model = temp;
    }

    // Свойство - получение модели.
    public String getModel() {
        return this.model;
    }

    // Свойство - изменение цвета.
    public void setColor(String temp) {
        this.color = color;
    }

    // Свойство - получение цвета.
    public String getColor() {
        return this.color;
    }

    // Свойство - изменение размера.
    public void setRadius(double temp) {
        this.radius = temp;
    }

    // Свойство - получение размера.
    public double getRadius() {
        return this.radius;
    }

    // Метод определения веса мяча: тяжелый или легкий.
    public Boolean isHeavy() {
        if (this.radius >= 5)
            return true;
        else return false;
    }

    // Метод toString().
    public String toString() {
        return this.model + ", color = " + this.color + ", radius = " + this.radius + ", heavy = " + isHeavy();
    }

    // Получение объема мяча.
    public void getSizeOfABall() {
        final double pi = 3.14;
        double size = 4.0 / 3.0 * Math.pow(radius, 3) * pi;
        System.out.println(this.model + "'s size is " + size);
    }
}

package task2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    // Конструктор с параметрами.
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Конструктор без параметров.
    public Ball() {

    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x = this.x + xDisp;
        this.y = this.y + yDisp;
    }

    public String toString() {
        return "x = " + this.x + ", y = " + this.y;
    }
}
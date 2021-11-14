package task3;

public class MovablePoint implements Movable {
    // Поля.
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    // Параметризированный конструктор.
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Переопределенный метод преобразования объекта в строку.
    public String toString(){
        return "Coordinates of Point: x: " + x + " y: " + y;
    }

    // Метод движения вверх.
    public void moveUp(){
        y += ySpeed;
    }

    // Метод движения вниз.
    public void moveDown(){
        y -= ySpeed;
    }

    // Метод движения влево.
    public void moveLeft(){
        x -= xSpeed;
    }

    // Метод движения вправо.
    public void moveRight(){
        x += xSpeed;
    }
}

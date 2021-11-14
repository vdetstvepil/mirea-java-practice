package task3;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    // Параметризированный констуктор.
    public MovableCircle(int x, int y, int radius, int xSpeed, int ySpeed){
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    // Переопределенный метод преобразования объекта в строку.
    public String toString(){
        return "Coordinates of the circle center: x: " + center.x + " y: " + center.y;
    }

    // Переопределенный метод движения вниз.
    @Override
    public void moveDown() {
        center.moveDown();
    }

    // Переопределенный метод движения вверх.
    @Override
    public void moveUp(){
        center.moveUp();
    }

    // Переопределенный метод движения влево.
    @Override
    public void moveLeft(){
        center.moveLeft();
    }

    // Переопределенный метод движения вправо.
    @Override
    public void moveRight(){
        center.moveRight();
    }
}

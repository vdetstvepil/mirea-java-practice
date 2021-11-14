package task3;

public class MovableRectangle extends Rectangle implements Movable{
    // Поля.
    protected MovablePoint upperLeft;
    protected MovablePoint lowerRight;

    // Параметризированный конструктор.
    public MovableRectangle(MovablePoint u, MovablePoint l) throws Exception {
        if (u.xSpeed == l.xSpeed
                && u.ySpeed == l.ySpeed) {
            upperLeft = u;
            lowerRight = l;
        }
        else
            throw new Exception("[!] Error.");
    }

    // Переопределенный метод движения вверх.
    @Override
    public void moveUp() {
        upperLeft.moveUp();
        lowerRight.moveUp();
    }

    // Переопределенный метод движения вниз.
    @Override
    public void moveDown() {
        upperLeft.moveDown();
        lowerRight.moveDown();

    }

    // Переопределенный метод движения влево.
    @Override
    public void moveLeft() {
        upperLeft.moveLeft();
        lowerRight.moveLeft();

    }

    // Переопределенный метод движения вправо.
    @Override
    public void moveRight() {
        upperLeft.moveRight();
        lowerRight.moveRight();

    }

}

package smirnov;

public class Test {
    public static void main(String[] args) {
        MovableRectangle prymougolnik = new MovableRectangle(new MovablePoint(4, 2, 2, 5), new MovablePoint(6, 4, 2, 5));
        if (prymougolnik.hasSameSpeed()){
            System.out.println(prymougolnik);
            prymougolnik.moveUp();
            prymougolnik.moveRight();
            prymougolnik.moveUp();
            System.out.println(prymougolnik);
        }
    }
}

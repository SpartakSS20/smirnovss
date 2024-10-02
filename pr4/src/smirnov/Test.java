package smirnov;

public class Test {
    public static void main(String[] args) {
        MovableCircle krug = new MovableCircle(8, new MovablePoint(2, 4, 10, 13));
        System.out.println(krug);
        krug.moveDown();
        krug.moveRight();
        System.out.println(krug);
        krug.moveUp();
        krug.moveLeft();
        System.out.println(krug);
    }
}

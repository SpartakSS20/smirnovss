package smirnov_pr10_11;

public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(4.4, 6.4),
                new ComparableRectangle(12.24, 54.4),
                new ComparableRectangle(8.4, 37.4),
                new ComparableRectangle(4.4, 29.4)};
        java.util.Arrays.sort(rectangles);
        for (Rectangle rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}
package smirnov;

public class Main {
    /*public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4.0, 40.0);
        System.out.println("Первый прямоугольник:");
        System.out.println("Ширина: " + rect1.getWidth()+" Высота: " + rect1.getHeight()+" Площадь: " + rect1.getArea()
                + " Периметр: " + rect1.getPerimeter());
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        System.out.println("Второй прямоугольник:");
        System.out.println("Ширина: " + rect2.getWidth()+" Высота: " + rect2.getHeight()+" Площадь: " + rect2.getArea()
                + " Периметр: " + rect2.getPerimeter());
    }
     */
    public static void main(String[] args) {
        Stock stock = new Stock("SBER", "ПАО Сбербанк");
        stock.setPreviousClosingPrice(281.50);
        stock.setCurrentPrice(282.87);
        double changePercent = stock.getChangePercent();
        System.out.printf("Процент изменения стоимости акций " + changePercent + "%%");
    }
}
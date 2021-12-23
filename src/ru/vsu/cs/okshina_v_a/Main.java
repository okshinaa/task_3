package ru.vsu.cs.okshina_v_a;

import ru.vsu.cs.okshina_v_a.figures.Circle;
import ru.vsu.cs.okshina_v_a.figures.HorizontalParabola;
import ru.vsu.cs.okshina_v_a.figures.Line;
import ru.vsu.cs.okshina_v_a.figures.Rectangle;

import java.awt.geom.Point2D;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Picture picture = new Picture(new Line(3,1,-4), new HorizontalParabola(6,-6,0.125),
                new Circle(0,-1,2), new Rectangle(new Point2D.Double(-3.0,-3.0),
                new Point2D.Double(3.0,1.0)));

        TestCase test = new TestCase();
        isTestCorrect(test,picture);

        double x =readPointCoordinates("X:");
        isCorrectPointCoordinate(x);

        double y = readPointCoordinates("Y:");
        isCorrectPointCoordinate(y);

        SimpleColor color = picture.getColor(x,y);

        printPointColor(x,y,color);
    }

    private static void isTestCorrect(TestCase test, Picture picture) {
        if (!test.isCorrectGetColor(picture)){
            System.out.println("Тесты выполнены с ошибкой, программа работает некорректно");
            System.exit(0);
        }
    }

    private static double readPointCoordinates(String pointName) {
        System.out.print("Введите координату " + pointName);

        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();
    }

    private static void isCorrectPointCoordinate(double pointCoordinate) {
        if (pointCoordinate < -10 || pointCoordinate > 10){
            System.out.println("Ошибка.Введены координаты не соответсвующие диапазону (-10;10)");
            System.exit(0);
        }
    }

    private static void printPointColor(double x, double y, SimpleColor color) {
        System.out.printf("Цвет точки (%.2f, %.2f) - %s", x, y, color);
    }
}

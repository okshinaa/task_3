package ru.vsu.cs.okshina_v_a.figures;

import java.awt.geom.Point2D;

public class Rectangle {
    public Point2D.Double p1;
    public Point2D.Double p2;

    public Rectangle(Point2D.Double p1, Point2D.Double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean isPointInsideRectangle(double x, double y) {
        return (x > p1.getX() && x < p2.getX()) && (y > p1.getY() && y < p2.getY());
    }
}

package ru.sbt.visitor;

public class Point2D extends Point {
    private double x;
    private double y;



    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public double visit(Visitor visitor) {
        return visitor.calc(this);
    }
}

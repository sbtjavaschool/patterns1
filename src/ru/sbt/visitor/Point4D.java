package ru.sbt.visitor;

public class Point4D extends Point {
    private double x;
    private double y;
    private double z;
    private double k;

    @Override
    public double visit(Visitor visitor) {
        return visitor.calc(this);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}

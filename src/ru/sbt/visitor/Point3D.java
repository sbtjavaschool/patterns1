package ru.sbt.visitor;

public class Point3D extends Point {
    private double x;
    private double y;
    private double z;

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

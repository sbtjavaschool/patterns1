package ru.sbt.visitor;

public class SqrtVisitor implements Visitor {
    @Override
    public double calc(Point2D p) {
        return Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY());
    }

    @Override
    public double calc(Point3D p) {
        return Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY() + p.getZ() * p.getZ());
    }

    @Override
    public double calc(Point4D point4D) {
        return 10;
    }
}

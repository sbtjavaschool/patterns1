package ru.sbt.visitor;

public class PrintDetailsVisitor implements Visitor {
    @Override
    public double calc(Point2D p) {
        System.out.println(p.getX() + " " + p.getY());
        return 0;
    }

    @Override
    public double calc(Point3D p) {
        System.out.println(p.getX() + " " + p.getY() + " " + p.getZ());
        return 0;
    }

    @Override
    public double calc(Point4D point4D) {
        return 10;
    }
}

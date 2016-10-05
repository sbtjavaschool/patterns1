package ru.sbt.visitor;

public class Main {
    public static void main(String[] args) {
        Point point = new Point3D();

        double result = point.visit(new SqrtVisitor());
        point.visit(new PrintDetailsVisitor());
    }
}

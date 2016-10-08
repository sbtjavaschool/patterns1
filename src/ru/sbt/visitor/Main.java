package ru.sbt.visitor;

public class Main {
    public static void main(String[] args) {
        Point point = new Point3D();

        System.out.println("HELLO");

        point.visit(new PrintDetailsVisitor());
    }
}

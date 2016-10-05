package ru.sbt.visitor;


public interface Visitor {
    double calc(Point2D point2D);

    double calc(Point3D point2D);

    double calc(Point4D point4D);
}

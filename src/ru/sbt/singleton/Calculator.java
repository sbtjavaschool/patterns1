package ru.sbt.singleton;

public class Calculator {
    private static Calculator ourInstance = new Calculator();

    public static Calculator getInstance() {
        return ourInstance;
    }

    private Calculator() {
    }

    public int calc(int a, int b) {
        return a + b;
    }
}

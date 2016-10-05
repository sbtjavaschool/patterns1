package ru.sbt.singleton;

public class Service {
    private final Calculator calculator;

    public Service(Calculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
        int calc = calculator.calc(1, 2);
    }

    public static void main(String[] args) {
        new Service(Calculator.getInstance());
    }
}

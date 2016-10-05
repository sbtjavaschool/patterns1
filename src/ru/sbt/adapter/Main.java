package ru.sbt.adapter;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new RequestCheckerAdapter(new RequestChecker()));
    }
}
